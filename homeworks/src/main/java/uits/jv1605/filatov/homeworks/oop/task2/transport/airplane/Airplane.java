/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.transport.airplane;

import uits.jv1605.filatov.homeworks.oop.task2.transport.Fuel;

/**
 *
 * @author Alex
 */
public class Airplane extends Fuel{
    
    public int capacity;
    public int payload;
    public String model;
    
    private final int[] capacities = {150, 275};
    private final int[] flightRanges = {9000, 14500};
    private final int[] fuelConsumptions = {130, 7300};
    
    public Airplane(){
        this.fuelType = FuelTypes.kerosene;
        this.capacity = (int)(Math.random() * (this.capacities[1] - this.capacities[0]) + 
                this.capacities[0]);
        this.flightRange = (int)(Math.random() * (this.flightRanges[1] - this.flightRanges[0]) +
                this.flightRanges[0]);
        this.fuelConsumption = (int)(Math.random() * (this.fuelConsumptions[1] - this.fuelConsumptions[0]) +
                this.fuelConsumptions[0]);
    }
    
    @Override
    public String toString(){
        return "airplane " + this.model + ". Capacity : " + this.capacity + " m3, payload : " +
               this.payload + " t, flight range : " + this.flightRange + " km, fuel type : " + this.fuelType +
               ", fuel consumption : " + this.fuelConsumption + " kg/hour";
    }
    
}
