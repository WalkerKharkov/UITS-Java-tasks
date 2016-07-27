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
public class MiddleCar extends Toy{
    
    private final String[] names = {"Gazel", "UAZ", "Sprinter"};
    private final int[] weights = {100, 200};
    
    public MiddleCar(){
        
        super();
        this.type = "middle car";
        this.name = this.names[(int)(Math.round(Math.random() * (this.names.length - 1)))];
        this.weight = (int)(Math.round(Math.random() * (this.weights[1] - this.weights[0] + this.weights[0])));
        
    }
    
}
