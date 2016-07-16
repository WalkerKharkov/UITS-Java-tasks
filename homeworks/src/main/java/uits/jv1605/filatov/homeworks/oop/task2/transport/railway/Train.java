/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.transport.railway;

import java.util.ArrayList;
import uits.jv1605.filatov.homeworks.oop.utils.GetCon;
import uits.jv1605.filatov.homeworks.oop.utils.MainUtils;

/**
 *
 * @author Alex
 */
public class Train <TypeCarriage extends Carriage>{
    
    public ArrayList <Carriage> train = new ArrayList <Carriage> ();
    
    public int totalPassengers = 0;
    public int totalPayload = 0;
    
    public Train(){
        int number = GetCon.getInteger("Enter the number of carriages which you want to add to train : ");
        double rand;
        Carriage carriage;
        for (int i = 0; i < number; i++){
            rand = Math.random() * 1;
            carriage = (rand > .5) ? new Coupe() : new Reserved();
            this.train.add(carriage);
            this.totalPassengers += carriage.passengersNumber;
            this.totalPayload += carriage.payload;
        }
    }
    
    public void show(){
        for (Carriage item: this.train){
            System.out.println(item);
        }
        System.out.println("Total passengers : " + this.totalPassengers);
        System.out.println("Total payload : " + this.totalPayload);
        System.out.println();
    }
    
    public void searchByPassengersNumber(){
        System.out.println("Search by passengers number");
        int minVal = GetCon.getInteger("Enter minimal value : ");
        int maxVal = GetCon.getInteger("Enter maximal value : ");
        for (Carriage item: this.train){
            if (MainUtils.inRange(item.passengersNumber, minVal, maxVal)){
                System.out.println(item);
            }    
        }
        System.out.println();
    }
    
}
