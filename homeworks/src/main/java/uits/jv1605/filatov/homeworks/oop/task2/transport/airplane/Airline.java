/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.transport.airplane;

import java.util.*;
import uits.jv1605.filatov.homeworks.oop.utils.GetCon;
import uits.jv1605.filatov.homeworks.oop.utils.MainUtils;
/**
 *
 * @author Alex
 */
public class Airline <TypeAirplane extends Airplane>{
    
    public ArrayList <Airplane> airline = new ArrayList <Airplane> ();
    
    public int totalCapacity = 0;
    public int totalPayload = 0;
    
    public Airline(){
        int number = GetCon.getInteger("Enter the number of airplanes which you want to buy : ");
        double rand;
        Airplane plane;
        for (int i = 0; i < number; i++){
            rand = Math.random() * 1;
            plane = (rand > .5) ? new Passenger() : new Cargo();
            this.airline.add(plane);
            this.totalCapacity += plane.capacity;
            this.totalPayload += plane.payload;
            }
    }
    
    public void show(){
        for (Airplane item: this.airline){
            System.out.println(item);
        }
        System.out.println("Total capacity : " + this.totalCapacity);
        System.out.println("Total payload : " + this.totalPayload);
        System.out.println();
    }
    
    public void searchByFuelConsumption(){
        System.out.println("Search by fuel consumption.");
        int minVal = GetCon.getInteger("Enter minimal value : ");
        int maxVal = GetCon.getInteger("Enter maximal value : ");
        for (Airplane item: this.airline){
            if (MainUtils.inRange(item.fuelConsumption, minVal, maxVal)){
                System.out.println(item);
            }    
        }
        System.out.println();
    }
    
}
