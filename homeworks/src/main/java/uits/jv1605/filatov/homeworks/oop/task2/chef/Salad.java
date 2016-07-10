/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.chef;

import java.util.*;
import uits.jv1605.filatov.homeworks.oop.utils.GetCon;
import uits.jv1605.filatov.homeworks.oop.utils.MainUtils;
/**
 *
 * @author Alex
 */
public class Salad <TypeVegetable extends Vegetable>{
    
    public ArrayList <Vegetable> salad = new ArrayList <Vegetable>(); 
    public String flavour;
    public int totalWeight = 0;
    public int totalCalorificValue = 0;
    
    private final String[] flavours = {"oil", "salt", "sour cream"};
    private final Map <String, Integer> vegetablesWeight = new HashMap <String, Integer>();
    
    public Salad(int length){
        double rand;
        Vegetable saladComponent;
        System.out.println("Ok, starting cut vegetables...");
        System.out.println();
        for (int i=0; i<length; i++){
            rand = Math.random() * 1;
            saladComponent = (rand < .5) ? new Vegetative() : new Fruit();
            this.salad.add(saladComponent);
            System.out.println("№ " + (i + 1) + " : " + saladComponent);
        }
        this.flavour = this.flavours[(int)(Math.random() * (this.flavours.length - 1))];
        this.getMeasures();
        this.getVegetablesByWeight();
    }
    
    public void sortSalad(){
        char mode = GetCon.getFirstChar("Enter the field for sort (w)eight / (c)alorific value : ");
        Salad.SaladComparator comp = new Salad.SaladComparator();
        switch(mode){
            case 'w':{
                comp.field = Salad.SaladComparator.SortingField.weight;
                break;
            }
            case 'c':{
                comp.field = Salad.SaladComparator.SortingField.calorificValue;
                break;
            }
            default:{
                System.out.println("Invalid argument!");
            }
        }
        Collections.sort(this.salad, comp);
        System.out.println("Sorted salad :");
        System.out.println();
        for (Vegetable veg: this.salad){
            System.out.println(veg);
        }
        System.out.println();
    }
    
    public void searchByCalorificValue(){
        int minVal = GetCon.getInteger("Enter minimal value : ");
        int maxVal = GetCon.getInteger("Enter maximal value : ");
        for (Vegetable veg: this.salad){
            if (MainUtils.inRange(veg.calorificValue, minVal, maxVal)){
                System.out.println(veg);
            }    
        }
    }
    
    private void getMeasures(){
        for (Vegetable veg: this.salad){
            this.totalWeight += veg.weight;
            this.totalCalorificValue += veg.calorificValue;
        }
    }
    
    private void getVegetablesByWeight(){
        Iterator <Vegetable> iterator = this.salad.iterator();
        Vegetable veg;
        String name;
        int weight;
        while (iterator.hasNext()){
            veg = iterator.next();
            name = veg.name;
            weight = veg.weight;
            if (this.vegetablesWeight.containsKey(name)){
                weight += this.vegetablesWeight.get(name);
            }    
            this.vegetablesWeight.put(name, weight);
        }
    }
    
    private String vegetablesToString(){
        String vegetablesString = "";
        String key;
        Set <String> set = this.vegetablesWeight.keySet();
        Iterator <String> iterator = set.iterator();
        while(iterator.hasNext()){
            key = iterator.next();
            vegetablesString += key + " - weight : " + 
                    this.vegetablesWeight.get(key) + "g, ";
        }
        vegetablesString = vegetablesString.substring(0, vegetablesString.length() - 2) + ".\n";
        return vegetablesString;
    }
    
    @Override
    public String toString(){
        return "\nThis salad from chef :\nContains : " + this.vegetablesToString() +
               "Total weight : " + this.totalWeight + "g.\n" +
               "Total calorific value : " + this.totalCalorificValue + " cal.\n";
    }
    
    public static class SaladComparator implements Comparator <Vegetable>{
        
        enum SortingField {weight, calorificValue};
        SortingField field = SortingField.weight;
        
        @Override
        public int compare(Vegetable firstVeg, Vegetable secondVeg){
            switch (field){
                case weight:{
                    return(firstVeg.weight - secondVeg.weight);
                }
                case calorificValue:{
                    return(firstVeg.calorificValue - secondVeg.calorificValue);
                }
                default:{
                    throw new IllegalArgumentException();
                }
            }
        }
        
    }
    
}