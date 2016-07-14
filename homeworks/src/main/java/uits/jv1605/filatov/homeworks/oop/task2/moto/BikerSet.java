/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.moto;

import java.util.*;
import uits.jv1605.filatov.homeworks.oop.utils.GetCon;
import uits.jv1605.filatov.homeworks.oop.utils.MainUtils;
/**
 *
 * @author Alex
 */
public class BikerSet{
    
    public int totalPrice;
    public ArrayList <Moto> equipment = new ArrayList <Moto> (4);
    
    private String equipmentContains = "";
    
    public BikerSet(){
        this.equipment.add(new Suit());
        this.equipment.add(new Gloves());
        this.equipment.add(new Helmet());
        this.equipment.add(new Jacket());
        for (Moto item: this.equipment){
            this.equipmentContains += item.toString();
            this.totalPrice += item.price;
        }    
        
    }
    
    public void sortByWeight(){
        Collections.sort(this.equipment, new Comparator <Moto>(){
            @Override
            public int compare(Moto first, Moto second){
                return first.weight - second.weight;
            }
        });
        System.out.println("Sorting by weight of equipment : ");
        for (Moto item: this.equipment){
            System.out.println(item);
        }
        System.out.println("");
    }
    
    public void searchByPrice(){
        System.out.println("Search equipment by price.");
        int minVal = GetCon.getInteger("Enter minimal value : ");
        int maxVal = GetCon.getInteger("Enter maximal value : ");
        for (Moto item: this.equipment){
            if (MainUtils.inRange(item.price, minVal, maxVal)){
                System.out.println(item);
            }    
        }
    }
    
    @Override
    public String toString(){
        return "This biker set contains: \n" + this.equipmentContains + 
                "Total equipment price : $" + this.totalPrice + "\n\n";
    }
    
}
