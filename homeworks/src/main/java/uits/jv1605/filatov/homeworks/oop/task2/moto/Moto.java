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
public class Moto extends Equipment{
    
    public byte protectionType;
    
    private final String[] brands = {"Atrox", "Yamaha", "Kawasaki", "Geon"};
    
    public Moto(){
        super();
        this.protectionType = (byte)(Math.random() * 5 + 1);
        this.brand = this.brands[(int)(Math.random() * (this.brands.length - 1))];
    }
    
    @Override
    public String toString(){
        return super.toString() + ", protection type: " + this.protectionType + 
               ", manufactured by " + this.brand + "\n";
    }
    
}
