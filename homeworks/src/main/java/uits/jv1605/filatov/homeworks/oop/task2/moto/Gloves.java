/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.moto;

/**
 *
 * @author Alex
 */
public class Gloves extends Moto{
    
    private final String[] materials = {"leather", "textile"};
    private final byte[] sizes = {6, 8, 10, 12};
    
    public Gloves(){
        super();
        this.material = this.materials[(int)(Math.random() * (this.materials.length - 1))];
        this.size = this.sizes[(int)(Math.random() * (this.sizes.length - 1))];
    }
    
    @Override
    public String toString(){
        return "Gloves : " + super.toString();
    }
    
}
