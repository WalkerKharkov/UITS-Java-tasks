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
public class Coupe extends Carriage{
    
    private final int[] passengersNumbers = {40, 48};
    private final int[] payloads = {1000, 3000};
    private final int[] comfortRanges = {1, 3};
    
    public Coupe(){
        super();
        this.passengersNumber = (int)(Math.random() * (this.passengersNumbers[1] - 
                this.passengersNumbers[0]) + this.passengersNumbers[0]);
        this.payload = (int)(Math.random() * (this.payloads[1] - this.payloads[0]) +
                this.payloads[0]);
        this.comfortRange = (int)(Math.random() * (this.comfortRanges[1] - this.comfortRanges[0]) +
                this.comfortRanges[0]);
    }
    
    @Override
    public String toString(){
        return "Cargo " + super.toString();
    }
    
}
