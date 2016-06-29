/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.bouquet;

/**
 *
 * @author Alex
 */
public class WildFlower extends Flower{
    
    public String location;
    
    private final String [] names = {"vasilyok", "geran", "klever", "mak", "oduvanchik"};
    
    public WildFlower(){
        super();
        this.name = this.names[(int)(Math.random() * (this.names.length - 1) + 1)];
    }
    
    public WildFlower(short stemLength, byte freshness, float price, String name){
        super(stemLength, freshness, price, name);
    }
    
    @Override
    public void setLocation(String location){
        this.location = location;
    }
    
}
