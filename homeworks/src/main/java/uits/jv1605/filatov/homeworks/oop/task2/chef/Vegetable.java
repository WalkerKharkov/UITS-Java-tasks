/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.chef;

//import java.util.Comparator;
/**
 *
 * @author Alex
 */
public class Vegetable {
    
    public int calorificValue;
    public int weight;
    public String color;
    public String name;
    
    private final String[] colors = {"red", "green", "yellow", "white", "brown", "pink"};
    
    public Vegetable(){
        this.color = this.colors[(int)(Math.random() * (this.colors.length - 1))];
        this.weight = (int)(Math.random() * (100) + 10);
        this.calorificValue = (int)(Math.random() * (80) + 10);
    }
    
    @Override
    public String toString(){
        return this.name + ", " + this.weight + "g., calorific value : " + this.calorificValue +
               ", color : " + this.color; 
    }
    
    
}
