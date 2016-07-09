/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.chef;

/**
 *
 * @author Alex
 */
public class Vegetative extends Vegetable{
    
    public int stemLength;
    
    private final String[] names = {"potato", "carrot", "beet", "radish", "turnip"}; 
    
    public Vegetative(){
        super();
        this.name = this.names[(int)(Math.random() * (this.names.length - 1))];
        this.stemLength = (int)(Math.random() * (70) + 5);
    }
    
}
