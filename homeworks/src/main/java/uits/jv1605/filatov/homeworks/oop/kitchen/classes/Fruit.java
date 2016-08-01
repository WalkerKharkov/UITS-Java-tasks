/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.kitchen.classes;

/**
 *
 * @author Alex
 */
public abstract class Fruit extends Plant{
    
    public Fruit () throws NoSuchFieldException, IllegalAccessException{
        super();
        this.type = "Fruit";
    }
    
    @Override
    public void peell(){
        this.isPeelled = true;
        this.weight *= .98;
    }
    
}
