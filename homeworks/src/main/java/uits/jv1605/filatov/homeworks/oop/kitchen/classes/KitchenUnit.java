/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.kitchen.classes;

import uits.jv1605.filatov.homeworks.oop.kitchen.interfaces.Slicer;
import uits.jv1605.filatov.homeworks.oop.kitchen.interfaces.Cutter;
import uits.jv1605.filatov.homeworks.oop.kitchen.interfaces.Peeller;

/**
 *
 * @author Alex
 */
public class KitchenUnit implements Cutter, Peeller, Slicer {
    
    public Basket basket;
    
    private boolean turnedOn = false;
    private boolean loaded = false;
    
    public KitchenUnit()throws IllegalAccessException, InstantiationException, ClassNotFoundException{
        this.basket = new Basket(0);
    }
    
    /* public methods */
    
    public void plantsLoad(Basket basket){
        this.basket.put("from", basket);
        this.loaded = true;
    }
    
    public void turn(){
        this.turnedOn = !this.turnedOn;
    }
    
    @Override 
    public double peellItem(Plant plant){
        if (!this.kitchenUnitCheck()){
            return this.unitError();
        }
        double oldWeight;
        if (!plant.isPeelled){
            oldWeight = plant.weight;
            plant.peell();
            this.basket.wasteWeightCorrection(oldWeight, plant.weight);
        }
        return plant.weight;
    }
    
    @Override
    public double peellItems(Plant[] plants){
        if (!this.kitchenUnitCheck()){
            return this.unitError();
        }
        double weight = 0;
        double oldWeight;
        for (int i = 0; i < plants.length; i++){
            if (!plants[i].isPeelled){
                oldWeight = plants[i].weight;
                plants[i].peell();
                this.basket.wasteWeightCorrection(oldWeight, plants[i].weight);
            }
            weight += plants[i].weight;
        }
        return weight;
    }
    
    @Override
    public double cut(Plant veg){
        if (veg.getClass().getSimpleName().compareTo("Vegetable") != 0){
            return -1;
        }
        return this.processItem(veg);
    }
    
    @Override
    public double cutAll(Plant[] vegs){
        for (int i = 0; i < vegs.length; i++){
            if (vegs[i].type.compareTo("Vegetable") != 0){
                return -1;
            }
        }
        return this.processItems(vegs);
    }
    
    @Override
    public double slice(Plant plant){
        return this.processItem(plant);
    }
    
    @Override
    public double sliceAll(Plant[] plants){
        return this.processItems(plants);
    }
    
    /* private methods */
    
    private <TypePlant extends Plant> double processItem(TypePlant plant){
        if (!this.kitchenUnitCheck()){
            return this.unitError();
        }
        this.isPeelled(plant);
        double oldWeight = plant.weight;
        plant.weight *= .98;
        this.basket.wasteWeightCorrection(oldWeight, plant.weight);
        return plant.weight;
    }
    
    private <TypePlant extends Plant> double processItems(TypePlant[] plants){
        if (!this.kitchenUnitCheck()){
            return this.unitError();
        }
        double weight = 0;
        double oldWeight;
        for (int i = 0; i < plants.length; i++){
            oldWeight = plants[i].weight;
            weight += this.processItem(plants[i]);
            this.basket.wasteWeightCorrection(oldWeight, plants[i].weight);
        }
        return weight;
    }
    
    private boolean kitchenUnitCheck(){
        return this.loaded && this.turnedOn;
    }
    
    private double unitError(){
        System.out.println("Kitchen unit is turned off or not loaded!\n----------------------------------------------");
        return -1;
    }
    
    private void isPeelled(Plant plant){
        if (!plant.isPeelled){
            throw new IllegalArgumentException("This plant is not peelled! Your kitchen unit is broken!" +
                    " You are stupid motherfucker!\n");
        }
    }
    
}