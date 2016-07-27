/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.coffee;

/**
 *
 * @author Alex
 */
public class InstantCoffee extends CoffeeCarriage{
    
    private final String[] packs = {"extra_pack", "super_pack", "big_pack", "pack", 
        "small_pack", "stick", "big_jar", "jar", "small_jar"};
    
    public InstantCoffee(){
        super();
        this.pack = this.packs[(int)(Math.round((Math.random() * (this.packs.length - 1))))];
        this.weight = super.PACKS.get(this.pack);
        this.price = (float)((((this.weight * Coffee.PRICES.get(this.sort)) / 1000) * .8) * this.qualityRate);
        this.weight += super.PACKAGE_WEIGHTS.get(this.pack);
    }
    
}
