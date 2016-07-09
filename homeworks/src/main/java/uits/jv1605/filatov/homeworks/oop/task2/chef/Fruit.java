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
public class Fruit extends Vegetable{
    
    public int fruitSize;
    
    private final String[] names = {"tomato", "cucumber", "pepper", "squash", "corn"};
    
    public Fruit(){
        super();
        this.name = this.names[(int)(Math.random() * (this.names.length - 1))];
        this.fruitSize = (int)(Math.random() * (20) + 2);
    }
    
}
