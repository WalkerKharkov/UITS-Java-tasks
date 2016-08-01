/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.kitchen.classes;

import uits.jv1605.filatov.homeworks.oop.kitchen.interfaces.Peellable;
import java.text.DecimalFormat;
import java.lang.reflect.Field;
/**
 *
 * @author Alex
 */
public abstract class Plant implements Peellable{
    
    public double weight;
    public String color;
    public byte ripeness;
    public byte condition;
    public boolean isPeelled = false;
    public int id;
    public String type;
    
    private final DecimalFormat f = new DecimalFormat("#0.00");
    
    private final String className;
    private final String[] colors;
    private final double minWeight;
    private final double maxWeight;
    
    public Plant() throws NoSuchFieldException, IllegalAccessException{
        Plant self = this;
        Class thisClass = self.getClass();
        this.className = thisClass.getSimpleName();
        this.ripeness = (byte)(Math.round(Math.random() * 2 + 1));
        this.condition = (byte)(Math.round(Math.random() * 2 + 1));
        Field field = thisClass.getField("COLORS");
        this.colors = (String[])field.get(self);
        this.color = this.colors[(int)(Math.round(Math.random() * (this.colors.length - 1)))];
        field = thisClass.getField("MIN_WEIGHT");
        this.minWeight = (double)(field.get(self));
        field = thisClass.getField("MAX_WEIGHT");
        this.maxWeight = (double)(field.get(self));
        this.weight = (double)(Math.random() * (this.maxWeight - this.minWeight) + this.minWeight);
    }
    
    @Override
    public String toString(){
        return  "id: " + this.id + ". " +this.className + ", weight - " + f.format(this.weight) + 
                ", color - " + this.color + ", ripeness - " + this.ripeness + ", condition - " + 
                this.condition + ", peelled - " + this.isPeelled;
    }
    
}
