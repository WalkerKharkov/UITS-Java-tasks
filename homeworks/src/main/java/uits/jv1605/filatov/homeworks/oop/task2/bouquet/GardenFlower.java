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
public class GardenFlower extends Flower{
    
    public String season;
    
    private final String[] names = {"roza", "pion", "iris", "nogotok", "astra", "georgin"};
    
    public GardenFlower(){
        super();
        this.name = this.names[(int)(Math.random() * (this.names.length - 1) + 1)];
    }
    
    public GardenFlower(short stemLength, byte freshness, float price, String name){
        super(stemLength, freshness, price, name);
    }
    
    @Override
    public void setSeason(String season){
        this.season = season;
    }
    
}
