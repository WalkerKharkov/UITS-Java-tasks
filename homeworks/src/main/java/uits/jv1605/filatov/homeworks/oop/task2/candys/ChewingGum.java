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
public class ChewingGum extends Candy{
    
    public String color;
    
    private String[] names = {"Donald", "Turbo", "Orbit", "Dirol"};
    private int[] weights ={5, 5, 2, 2};
    private byte[] sugarContents = {1, 1, 0, 0};
    private final float[] prices = {2, 3, 1, 1};
    private final int i;
    
    public ChewingGum(){
        i = (int)(Math.random() * (this.names.length-1));
        this.name = this.names[i];
        this.weight = this.weights[i];
        this.sugarContent = this.sugarContents[i];
        this.price = this.prices[i];
    }
    
    @Override
    public void setColor(String color){
        this.color = color;
    }
    
}
