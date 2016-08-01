/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.kitchen.classes;

import java.text.DecimalFormat;
import java.util.ArrayList;
/**
 *
 * @author Alex
 */
public class Basket {
    
    public double basketWeight = 0;
    public double wasteWeight = 0;
    public ArrayList <Plant> fruitBasket;
    
    
    private final static String[] PLANTS = {"Apple", "Pear", "Banana", "Orange", "Potato", "Carrot",
                              "Celery", "Onion"};
    private final int plantsNumber;
    private final DecimalFormat f = new DecimalFormat("#0.00");
    private int currentId = 1;
    
        
    public Basket(int num) throws IllegalAccessException, InstantiationException, ClassNotFoundException{
        this.plantsNumber = num;
        this.fruitBasket = new ArrayList(this.plantsNumber);
        
        for (int i = 0; i < this.plantsNumber; i++){
            Plant newPlant = this.getNewPlant();
            newPlant.id = this.currentId++;
            this.basketWeight += newPlant.weight;
            this.fruitBasket.add(newPlant);
        }
    }
    
    /* public methods */
    
    public Plant getNewPlant() throws IllegalAccessException, InstantiationException, ClassNotFoundException{
        Class PlantClass = Class.forName("uits.jv1605.filatov.homeworks.oop.kitchen.final_plants." +
                    Basket.PLANTS[(int)(Math.round(Math.random() * (Basket.PLANTS.length - 1)))]);
            Object plant = PlantClass.newInstance();
            Plant newPlant = (Plant)plant;
            return newPlant;
    }
    
    public void showBasket(){
        for (Plant item: this.fruitBasket){
            System.out.println(item);
        }
        System.out.println("----------------------------------------------");
        System.out.println("Total basket weight : " + this.getWeight());
        System.out.println("Total waste weight : " + this.getWasteWeight());
        System.out.println("----------------------------------------------");
    }
    
    public String getWeight(){
        return f.format(this.basketWeight);
    }
    
    public String getWasteWeight(){
        return f.format(this.wasteWeight);
    }
    
    public Plant extract(int index){
        if (this.fruitBasket.isEmpty()) {
            this.empty();
            return null;
        }
        this.basketWeight -= this.fruitBasket.get(index).weight;
        return this.fruitBasket.remove(index);
    }
    
    public Plant[] extract(){
        if (this.fruitBasket.isEmpty()) {
            this.empty();
            return null;
        }
        Plant[] basket = new Plant[this.fruitBasket.size()];
        for (int i = 0; i < basket.length; i++){
            basket[i] = this.fruitBasket.remove(0);
            this.basketWeight = 0;
        }
        return basket;
    }
    
    public Plant[] extractAllFruits() throws ClassNotFoundException, IllegalAccessException, InstantiationException{
        return this.extractPlantSet("Fruit");
    }
    
    public Plant[] extractAllVegetables() throws ClassNotFoundException, IllegalAccessException, InstantiationException{
        return this.extractPlantSet("Vegetable");
    }
    
    public void put(Plant plant){
        plant.id = this.currentId++;
        this.fruitBasket.add(plant);
        this.basketWeight += plant.weight;
    }
    
    public void put(Plant[] plants){
        for (int i = 0; i < plants.length; i++){
            plants[i].id = this.currentId++;
            this.fruitBasket.add(plants[i]);
            this.basketWeight += plants[i].weight;
        }
    }
    
    public void put(String mode, Basket basket){
        switch(mode){
            case "from":{
                if (basket.fruitBasket.isEmpty()) {
                    this.empty();
                    break;
                }
                for (int i = 0; i < basket.fruitBasket.size(); i++){
                    basket.fruitBasket.get(i).id = this.currentId++;
                    this.basketWeight += basket.fruitBasket.get(i).weight;
                    this.fruitBasket.add(basket.fruitBasket.get(i));
                }
                break;
            }
            case "to":{
                if (this.fruitBasket.isEmpty()) {
                    this.empty();
                    break;
                }
                for (int i = 0; i < this.fruitBasket.size(); i++){
                    basket.fruitBasket.add(this.fruitBasket.remove(0));
                    this.basketWeight = 0;
                }
            }
            default:{
                System.out.println("Invalid mode!");
            }
        }
    }
    
    public int getIndexById(int id){
        for (int i = 0; i < this.fruitBasket.size(); i++){
            if (this.fruitBasket.get(i).id == id){
                return i;
            }
        }
        return -1;
    }
    
    public void wasteWeightCorrection(double oldWeight, double newWeight){
        this.wasteWeight += oldWeight - newWeight;
    }
    
    /* private methods */
    
    private Plant[] extractPlantSet(String className) throws IllegalAccessException, InstantiationException{
        if (this.fruitBasket.isEmpty()) {
            this.empty();
            return null;
        }
        Plant[] setBasket;
        Plant[] basket = new Plant[this.fruitBasket.size()];
        int j = 0;
        for (int i = 0; i < this.fruitBasket.size(); i++){
            if (this.fruitBasket.get(i).type.compareTo(className) == 0){
                this.basketWeight -= this.fruitBasket.get(i).weight;
                basket[j++] = this.fruitBasket.remove(i--);
            }
        }
        setBasket = new Plant[j];
        for (int i = 0; i < j; i++){
            setBasket[i] = basket[i];
        }
        return setBasket;
    }
    
    private void empty(){
        System.out.println("Source basket is empty!");
    }
    
}