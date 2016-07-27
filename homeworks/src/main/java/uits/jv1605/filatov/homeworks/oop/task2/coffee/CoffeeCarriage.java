/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.coffee;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alex
 */
public abstract class CoffeeCarriage {
    
    public int weight;
    public float price;
    public String sort;
    public String pack;
    public int quality;
    public float qualityRate;
    
    public static final Map <String, Integer> PACKS = new HashMap();
    public static final Map <String, Integer> PACKAGE_WEIGHTS = new HashMap();
    
    public String[] packs = {};
    
    static{
        PACKS.put("extra_pack", 2500);
        PACKS.put("super_pack", 1000);
        PACKS.put("big_pack", 250);
        PACKS.put("pack", 100);
        PACKS.put("small_pack", 50);
        PACKS.put("stick", 1);
        PACKS.put("big_jar", 250);
        PACKS.put("jar", 100);
        PACKS.put("small_jar", 50);
        
        PACKAGE_WEIGHTS.put("extra_pack", 50);
        PACKAGE_WEIGHTS.put("super_pack", 10);
        PACKAGE_WEIGHTS.put("big_pack", 10);
        PACKAGE_WEIGHTS.put("pack", 5);
        PACKAGE_WEIGHTS.put("small_pack", 5);
        PACKAGE_WEIGHTS.put("stick", 1);
        PACKAGE_WEIGHTS.put("big_jar", 100);
        PACKAGE_WEIGHTS.put("jar", 80);
        PACKAGE_WEIGHTS.put("small_jar", 50);
    }
    
    public CoffeeCarriage(){
        this.sort = Coffee.sort[(int)(Math.round((Math.random() * (Coffee.sort.length - 1))))];
        this.quality = (int)(Math.round(Math.random() * 3 + 1));
        this.qualityRate = (1 / (float)(this.quality));
    }
    
    @Override
    public String toString(){
        String className = getClass().getSimpleName();
        String conditionName = className.substring(0, className.indexOf("Coffee"));
        DecimalFormat f = new DecimalFormat("#0.00");
        return "Coffee pack. Sort : " + this.sort + ", condition : " + conditionName +
               ", quality : " + this.quality + ", package : " + this.pack + ", weight : " + 
                this.weight + ", price : " + f.format(this.price);
    }
    
}
