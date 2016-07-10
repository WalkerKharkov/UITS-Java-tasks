/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.stones;

/**
 *
 * @author Alex
 */
public class SemiGemstone extends Stone{
    
    private final String[] names = {"nephritis", "malachite", "agate", "pearl", "amber"};
    
    public SemiGemstone(){
        super();
        this.name = this.names[(int)(Math.random() * (this.names.length - 1))];
    }
    
    @Override
    public String toString(){
        return this.name + ", " + super.toString();
    }
    
}
