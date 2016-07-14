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
public class Suit extends Moto{
    
    private final String[] materials = {"leather", "jeans", "polyester"};
    private final byte[] sizes = {42, 44, 46, 48, 50, 52, 54, 56, 58, 60};
    
    public Suit(){
        super();
        this.material = this.materials[(int)(Math.random() * (this.materials.length - 1))];
        this.size = this.sizes[(int)(Math.random() * (this.sizes.length - 1))];
    }
    
    @Override
    public String toString(){
        return "Suit : " + super.toString();
    }
    
}
