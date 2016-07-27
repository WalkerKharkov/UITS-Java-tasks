/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.toys;

import java.util.*;
import uits.jv1605.filatov.homeworks.oop.utils.GetCon;
import uits.jv1605.filatov.homeworks.oop.utils.MainUtils;
/**
 *
 * @author Alex
 */
public class PlayingRoom {
    
    public ArrayList <Toy> room = new ArrayList <Toy> ();
    
    public double totalPrice;
    public double roomPrice = 0;
    
    private int minimalPrice = 1000;
    private int minimalToyPrice = 10;
    private boolean insufficientFunds = true;
    private Toy toy;
    
    public PlayingRoom(){
        
        int rand;
        
        while(this.insufficientFunds){
            this.totalPrice = GetCon.getDouble("Enter the maximal price of playing room : ");
            if (this.totalPrice < this.minimalPrice){
                System.out.println("С такими бабками тебе не игровую комнату покупать, а бутылки собирать! :)");
            }else{
                this.insufficientFunds = false;
            }
        }
        
        this.toy = new SmallCar();
        this.addToy(this.toy);
        this.toy = new MiddleCar();
        this.addToy(this.toy);
        this.toy = new BigCar();
        this.addToy(this.toy);
        this.toy = new Puppet();
        this.addToy(this.toy);
        this.toy = new Ball();
        this.addToy(this.toy);
        this.toy = new Blocks();
        this.addToy(this.toy);
        
        while (this.totalPrice >= this.minimalToyPrice){
            rand = (int)(Math.round(Math.random() * 5 + 1));
            switch (rand){
                case 1:{
                    this.toy = new SmallCar();
                    break;
                }
                case 2:{
                    this.toy = new MiddleCar();
                    break;
                }
                case 3:{
                    this.toy = new BigCar();
                    break;
                }
                case 4:{
                    this.toy = new Puppet();
                    break;
                }
                case 5:{
                    this.toy = new Ball();
                    break;
                }
                default:{
                    this.toy = new Blocks();
                }
            }
            if ((this.totalPrice - this.toy.price) >= 0){
                this.addToy(this.toy);
            }
        }
        
        System.out.println("");
        System.out.println("Your playing room contains : ");
        for (Toy item : this.room){
            System.out.println(item);
        }
        System.out.println();
        System.out.println("Total price : " + this.roomPrice);
        
    }
    
    public void sortToys(){
        char mode = GetCon.getFirstChar("Enter the field for sort : (w)eight / (p)rice / "
                + "(c)olor / (t)ype / (n)ame : ");
        PlayingRoom.ToyComparator comp = new PlayingRoom.ToyComparator();
        switch(mode){
            case 'w':{
                comp.field = PlayingRoom.ToyComparator.SortingField.weight;
                break;
            }
            case 'p':{
                comp.field = PlayingRoom.ToyComparator.SortingField.price;
                break;
            }
            case 'c':{
                comp.field = PlayingRoom.ToyComparator.SortingField.color;
                break;
            }
            case 't':{
                comp.field = PlayingRoom.ToyComparator.SortingField.type;
                break;
            }
            case 'n':{
                comp.field = PlayingRoom.ToyComparator.SortingField.name;
                break;
            }
            default:{
                System.out.println("Invalid argument!");
            }
        }
        Collections.sort(this.room, comp);
        System.out.println("Toys, sorted by " + comp.field + " :");
        System.out.println();
        for (Toy item: this.room){
            System.out.println(item);
        }
        System.out.println();
    }
    
    public void searchBySomeParameter(){
        char mode = GetCon.getFirstChar("Enter the field for search : (w)eight / (p)rice  : ");
        int minVal = GetCon.getInteger("Enter minimal value : ");
        int maxVal = GetCon.getInteger("Enter maximal value : ");
        switch (mode){
            case 'w':{
                for (Toy item: this.room){
                    if (MainUtils.inRange(item.weight, minVal, maxVal)){
                        System.out.println(item);
                    }
                }
                break;
            }
            case 'p':{
                for (Toy item: this.room){
                    if (MainUtils.inRange(item.price, minVal, maxVal)){
                        System.out.println(item);
                    }
                }
                break;
            }
            default:{
                System.out.println("Invalid argument!");
            }
        }
        
    }
    
    private void addToy(Toy toy){
        this.room.add(toy);
        this.totalPrice -= toy.price;
        this.roomPrice += toy.price;
    }
    
    private static class ToyComparator implements Comparator <Toy>{
        
        enum SortingField {weight, price, color, type, name};
        SortingField field = SortingField.weight;
        
        @Override
        public int compare(Toy firstToy, Toy secondToy){
            switch (field){
                case weight:{
                    return(firstToy.weight - secondToy.weight);
                }
                case price:{
                    return(firstToy.price - secondToy.price);
                }
                case color:{
                    return(firstToy.color.compareTo(secondToy.color));
                }
                case type:{
                    return(firstToy.type.compareTo(secondToy.type));
                }
                case name:{
                    return(firstToy.name.compareTo(secondToy.name));
                }
                default:{
                    throw new IllegalArgumentException();
                }
            }
        }
        
    }
    
}
