/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.transport.railway;

/**
 *
 * @author Alex
 */
public class Carriage extends Railway{
    
    public int passengersNumber;
    public int payload;
    
    @Override
    public String toString(){
        return "carriage, passengers: " + this.passengersNumber + ", payload : " +
               this.payload + " kg. Comfort range : " + this.comfortRange;
    }
    
}
