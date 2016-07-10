/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.stones;

/**
 *
 * @author Alex
 */
public class Stone {
    
    public double weight;
    public int price;
    public byte transparency;
    public String name;
    
    public Stone(){
        this.weight = Math.random() * 1;
        this.transparency = (byte)(Math.random() * 5 + 1);
        this.price = (int)(this.weight * this.transparency * 100);
    }

    @Override
    public String toString(){
        return "weight : " + this.weight + "k, transparency : " + this.transparency +
               ", price : $" + this.price;
    }
    
}
