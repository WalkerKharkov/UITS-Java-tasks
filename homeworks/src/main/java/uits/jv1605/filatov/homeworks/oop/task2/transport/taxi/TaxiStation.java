/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.transport.taxi;

import java.util.ArrayList;
import uits.jv1605.filatov.homeworks.oop.utils.GetCon;
import uits.jv1605.filatov.homeworks.oop.utils.MainUtils;

/**
 *
 * @author Alex
 */
public class TaxiStation {
    
    public ArrayList <Taxi> station = new ArrayList <Taxi> ();
    
    public int totalPrice = 0;
    
    public TaxiStation(){
        int number = GetCon.getInteger("Enter the number of cars which you want to buy : ");
        Taxi car;
        for (int i = 0; i < number; i++){
            car = new Taxi();
            this.station.add(car);
            this.totalPrice += car.price;
        }
    }
    
    public void show(){
        for (Taxi item: this.station){
            System.out.println(item);
        }
        System.out.println("Total price : " + this.totalPrice);
        System.out.println();
    }
    
    public void searchBySpeed(){
        System.out.println("Search by speed");
        int minVal = GetCon.getInteger("Enter minimal value : ");
        int maxVal = GetCon.getInteger("Enter maximal value : ");
        for (Taxi item: this.station){
            if (MainUtils.inRange(item.speed, minVal, maxVal)){
                System.out.println(item);
            }    
        }
        System.out.println();
    }
    
}
