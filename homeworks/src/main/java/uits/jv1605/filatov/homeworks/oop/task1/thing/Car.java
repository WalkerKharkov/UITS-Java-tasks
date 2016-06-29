/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task1.thing;

import uits.jv1605.filatov.homeworks.oop.utils.Filter;
import uits.jv1605.filatov.homeworks.oop.utils.MainUtils;

/**
 *
 * @author Alex
 */
public class Car extends Thing{
    
    public String brand;
    public String model;
    public short year;
    public String color;
    public String number;
    
    public Car(Thing thing){
        super(thing);
    }
    
    public Car(Thing thing, String brand, String model, short year, String color,
               String number){
        super(thing);
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.number = number;
    }
    
    public Car(int id, float price, String brand, String model, short year, String color,
               String number){
        this.id = id;
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.number = number;
    }
    
    public void setCarSettings(String brand, String model, short year, String color,
                               String number){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.number = number;
    }
    
    @Override
    public String toString(){
        return "Car :\nbrand : " + this.brand + ", model : " + this.model + "\n" +
               super.toString() + "year : " + this.year + "\ncolor : " + this.color +
               "reg. № : " + this.number + "\n";
    }
    
    public void filterApply(Filter filter){
        switch (filter.mode){
            case 'b':
                if (this.brand.equals(filter.brand)){
                    System.out.println(this.toString());
                }    
                break;
            case 'm':
                if ((this.model.equals(filter.model)) && ((MainUtils.getCurrentYear() - filter.expYears) > this.year)){
                    System.out.println(this.toString());
                }    
                break;
            case 'y':
                if ((this.year == filter.year) && (this.price > filter.price)){
                    System.out.println(this.toString());
                }    
                break;    
        }
    }
    
}
