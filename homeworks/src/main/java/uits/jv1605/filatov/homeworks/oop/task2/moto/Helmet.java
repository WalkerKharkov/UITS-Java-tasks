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
public class Helmet extends Moto{
    
    private final String[] materials = {"fiberglass", "CFRP", "thermoplastic"};
    private final byte[] sizes = {51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62};
    
    public Helmet(){
        super();
        this.material = this.materials[(int)(Math.random() * (this.materials.length - 1))];
        this.size = this.sizes[(int)(Math.random() * (this.sizes.length - 1))];
    }
    
    @Override
    public String toString(){
        return "Helmet : " + super.toString();
    }
    
}
