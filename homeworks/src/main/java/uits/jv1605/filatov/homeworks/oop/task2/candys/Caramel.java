/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.candys;

/**
 *
 * @author Alex
 */
public class Caramel extends Candy{
    
    public String stuff;
    
    private String[] names = {"Djushes", "Barbaris", "Gusinye lapki", "Rakovye sheiki"};
    private int[] weights ={10, 10, 8, 8};
    private byte[] sugarContents = {6, 6, 3, 3};
    private final float[] prices = {1, 1, 0.50f, 0.50f};
    private final int i;
    
    public Caramel(){
        i = (int)(Math.random() * (this.names.length-1));
        this.name = this.names[i];
        this.weight = this.weights[i];
        this.sugarContent = this.sugarContents[i];
        this.price = this.prices[i];
    }
    
    @Override
    public void setStuff(String stuff){
        this.stuff = stuff;
    }
    
}
