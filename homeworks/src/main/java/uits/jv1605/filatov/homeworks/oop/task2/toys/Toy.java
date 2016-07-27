/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.toys;

/**
 *
 * @author Alex
 */
public abstract class Toy {
    
    public int price;
    public int weight;
    public String type;
    public String name;
    public String color;
    
    private final String[] colors = {"Red", "Green", "Blue", "Yellow", "Pink", "Orange"};
    
    public Toy(){
        
        this.price = (int)(Math.round(Math.random() * 100 + 10));
        this.color = this.colors[(int)(Math.round(Math.random() * (this.colors.length - 1)))];
        
    }
    
    @Override
    public String toString(){
        return "Toy. Type : " + this.type + ", name : " + this.name + ". Price : " +
                this.price + ", weight : " + this.weight + ", color : " + this.color;
    }
    
}
