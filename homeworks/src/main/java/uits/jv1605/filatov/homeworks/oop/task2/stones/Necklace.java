/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.stones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import uits.jv1605.filatov.homeworks.oop.task2.soundrecord.ModernRecord;
import uits.jv1605.filatov.homeworks.oop.task2.soundrecord.Record;
import uits.jv1605.filatov.homeworks.oop.task2.soundrecord.RetroRecord;
import uits.jv1605.filatov.homeworks.oop.utils.GetCon;

/**
 *
 * @author Alex
 */
public class Necklace <TypeStone extends Stone>{
    
    public ArrayList <Stone> necklace = new ArrayList <Stone>(); 
    public int totalPrice = 0;
    public double totalWeight = 0;
    public String stones = "";
    
    public Necklace(int length){
        double rand;
        Stone stone;
        System.out.println("Necklace consist of : ");
        System.out.println();
        for (int i=0; i<length; i++){
            rand = Math.random() * 1;
            stone = (rand < .5) ? new Gemstone() : new SemiGemstone();
            this.totalWeight += stone.weight;
            this.totalPrice += stone.price;
            this.necklace.add(stone);
            System.out.println("№ " + (i + 1) + " : " + stone);
        }
        getStones();
    }
    
    public void sortByPrice(){
        System.out.println("Sort by price : ");
        Necklace.StoneComparator comp = new Necklace.StoneComparator();
        Collections.sort(this.necklace, comp);
        System.out.println();
        for (Stone stone: this.necklace){
            System.out.println(stone);
        }
        System.out.println();
    }
    
    public void searchByTransparency(){
        System.out.println("Search by transparency");
        byte minVal = GetCon.getByte("Enter minimal value : ");
        byte maxVal = GetCon.getByte("Enter maximal value : ");
        for (Stone stone: this.necklace){
            if ((stone.transparency >= minVal) && (stone.transparency <= maxVal)){
                System.out.println(stone);
            }    
        }
    }
    
    public void getStones(){
        for (Stone stone: this.necklace){
            this.stones += stone.name + " : " + stone.weight + "k, tr-cy : " + 
                           stone.transparency + ",  $" + stone.price + "\n";
        }
    }
    
    @Override
    public String toString(){
        return "\nThis necklace consist of : \n" + this.stones +
               "Total weight : " + this.totalWeight + "\nTotal price : $" + this.totalPrice + "\n";
    }
    
    public static class StoneComparator implements Comparator <Stone>{
        @Override
        public int compare(Stone stone1, Stone stone2){
                return stone1.price - stone2.price;
        }
    }
    
}
