/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.appliances;

import java.util.Comparator;
/**
 *
 * @author Alex
 */
public class Appliance {
    
    public int power;
    public int price;
    public String brand;
    public String name;
    
    private final static String brands[] = {"Panasonic", "Daewoo", "Sony", "Apple", "Pioneer", "Vitek"};
    
    protected boolean turned = false;
    
    public Appliance(){
        this.brand = this.brands[(int)(Math.random() * (this.brands.length - 1))];
        this.power = (int)(Math.random() * (2500) + 300);
        this.price = (int)(Math.random() * (3000) + 50);
    }
    
    public void turnOn(){
        this.turned = true;
    }
    
    public float getPower(){
        return (turned) ? this.power : 0;
    }
    
    @Override
    public String toString (){
        return " appliance " + this.name + ", manufactured by " + this.brand + 
               ", power : " + this.power + "W, price : " + this.price;
    }
    
    public static class AppComparator implements Comparator<Appliance>{
        
        @Override
        public int compare(Appliance first, Appliance second){
            return first.power - second.power;
        }
        
    }
}
