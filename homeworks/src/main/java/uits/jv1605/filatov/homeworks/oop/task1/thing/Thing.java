/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task1.thing;

import java.text.*;
/**
 *
 * @author Alex
 */
public class Thing {
    
    public int id;
    public float price;
    
    public Thing(){}
    
    public Thing(int id){
        this.id = id;
    }
    
    public Thing(int id, float price){
        this.id = id;
        this.price = price;
    }
    
    public Thing(Thing thing){
        this.id = thing.id;
        this.price = thing.price;
    }
    
    public void setPrice(float price){
        this.price = price;
    }
    
    public String getPrice(){
        return (new DecimalFormat("#########.00")).format(this.price);
    }
    
    @Override
    public String toString(){
        return "id: " + this.id + "\nprice: " + this.getPrice() + "\n";
    }
    
}
