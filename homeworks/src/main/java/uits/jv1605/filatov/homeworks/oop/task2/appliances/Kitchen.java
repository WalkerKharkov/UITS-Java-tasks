/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.appliances;

/**
 *
 * @author Alex
 */
public class Kitchen extends Appliance{
    
    private final static String[] names = {"breadmaker", "toaster", "fridge", "microwave"};
    
    public Kitchen(){
        super();
        this.name = this.names[(int)(Math.random() * (this.names.length - 1))];
    }
    
    @Override
    public String toString(){
        return "Kitchen" + super.toString();
    }
    
}
