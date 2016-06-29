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
public class ExoticFlower extends Flower{
    
    public String country;
    
    private final String [] names = {"orchideya", "aloe", "fikus", "jukka"};
    
    public ExoticFlower(){
        super();
        this.name = this.names[(int)(Math.random() * (this.names.length - 1) + 1)];
    }
    
    public ExoticFlower(short stemLength, byte freshness, float price, String name){
        super(stemLength, freshness, price, name);
    }
    
    @Override
    public void setCountry(String country){
        this.country = country;
    }
    
}
