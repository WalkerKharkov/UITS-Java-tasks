/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.coffee;

import java.text.DecimalFormat;
import java.util.*;
import uits.jv1605.filatov.homeworks.oop.utils.GetCon;
import uits.jv1605.filatov.homeworks.oop.utils.MainUtils;
/**
 *
 * @author Alex
 */
public class CoffeeVan {
    
    public ArrayList <CoffeeCarriage> carriage = new ArrayList <CoffeeCarriage> ();
    
    public double totalPrice;
    public double carriagePrice = 0;
    public int totalWeight;
    public int carriageWeight = 0;
    
    private DecimalFormat f = new DecimalFormat("#0.00");
    
    public CoffeeVan(){
        
        int rand;
        CoffeeCarriage item;
        
        this.totalPrice = GetCon.getDouble("Enter the maximal price of carriage : ");
        this.totalWeight = GetCon.getInteger("Enter the maximal weight of carriage (in gramm) : ");
        
        while (this.totalPrice > 0 && this.totalWeight > 0){
            rand = (int)(Math.round(Math.random() * 2));
            switch (rand) {
                case 0 : {
                    item = new BeanCoffee();
                    break;
                }
                case 1 : {
                    item = new GroundCoffee();
                    break;
                }
                case 2 : {
                    item = new InstantCoffee();
                    break;
                }
                default : {
                    item = new BeanCoffee();
                }
            }
            if (this.totalPrice < 3 || this.totalWeight < 3){
                item = new InstantCoffee();
                item.pack = "makeweight";
                item.price = 1;
                item.weight = this.totalWeight;
            }
            item.price = (item.price == 0) ? .1f : item.price;
            if (((this.totalPrice - item.price) >= 0) && ((this.totalWeight - item.weight) >= 0)){
                this.carriage.add(item);
                this.totalWeight -= item.weight;
                this.carriageWeight += item.weight;
                this.totalPrice -= item.price;
                this.carriagePrice += item.price;
            }
        }
        
        System.out.println("");
        System.out.println("Your coffee van contains : ");
        for (CoffeeCarriage coffeePack : this.carriage){
            System.out.println(coffeePack);
        }
        System.out.println();
        System.out.println("Total weight : " + this.carriageWeight + ", total price : " +
                f.format(this.carriagePrice));
        
    }
    
    public void sortByPriceAndWeight(){
        Collections.sort(this.carriage, new Comparator <CoffeeCarriage>(){
            @Override
            public int compare(CoffeeCarriage first, CoffeeCarriage second){
                double result;
                result =  (first.price / first.weight) - (second.price / second.weight);
                if (result > 0){
                    return 1;
                } else if (result < 0){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("");
        System.out.println("Sorting by price/weight : ");
        for (CoffeeCarriage item: this.carriage){
            System.out.println(item);
        }
        System.out.println("");
    }
    
    public void searchByQuality(){
        System.out.println("Search coffee packs by quality.");
        int minVal = GetCon.getInteger("Enter minimal value : ");
        int maxVal = GetCon.getInteger("Enter maximal value : ");
        for (CoffeeCarriage item: this.carriage){
            if (MainUtils.inRange(item.quality, minVal, maxVal)){
                System.out.println(item);
            }    
        }
    }
    
}
