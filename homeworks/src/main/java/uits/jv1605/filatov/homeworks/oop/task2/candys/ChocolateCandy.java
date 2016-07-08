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
public class ChocolateCandy extends Candy{
    
    public String chocolateType;
    
    private final String[] names = {"Kara-kum", "Krasnyi mak", "Meteorit", "Mishka"};
    private final int[] weights ={20, 20, 35, 15};
    private final byte[] sugarContents = {5, 3, 5, 2};
    private final float[] prices = {5, 4, 7, 2};
    private final int i;
    
    public ChocolateCandy(){
        i = (int)(Math.random() * (this.names.length-1));
        this.name = this.names[i];
        this.weight = this.weights[i];
        this.sugarContent = this.sugarContents[i];
        this.price = this.prices[i];
    }
    
    @Override
    public void setChocolateType(String chocolateType){
        this.chocolateType = chocolateType;
    }
    
}
