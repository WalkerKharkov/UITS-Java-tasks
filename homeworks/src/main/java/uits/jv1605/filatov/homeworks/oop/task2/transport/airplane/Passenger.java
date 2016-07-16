/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.transport.airplane;

/**
 *
 * @author Alex
 */
public class Passenger extends Airplane{
    
    public int passengersNumber;
    
    private final int[] payloads = {30, 70};
    private final String[] models = {"Boeing-747", "Boeing-777", "Boeing-787", "TU-134", "AN-158"};
    private final int[] passengerNumbers = {90, 900};
    
    public Passenger(){
        super();
        this.payload = (int)(Math.random() * (this.payloads[1] - this.payloads[0]) +
                this.payloads[0]);
        this.passengersNumber = (int)(Math.random() * (this.passengerNumbers[1] - this.passengerNumbers[0]) +
                this.passengerNumbers[0]);
        this.model = this.models[(int)(Math.random() * (this.models.length - 1))];
    }
    
    @Override
    public String toString(){
        return "Passenger " + super.toString() + ". Passengers on board number : " +
               this.passengersNumber;
    }
}
