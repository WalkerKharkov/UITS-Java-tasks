/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.transport;

import java.util.Comparator;
/**
 *
 * @author Alex
 */
public class TransportComparator implements Comparator <Transport> {
    
    public enum SortField{FlightRange, ComfortRange, FuelConsumption};
    
    public SortField field;
    
    @Override
    public int compare (Transport item1, Transport item2) throws IllegalArgumentException {
        switch (field){
            case FlightRange : {
                return item1.flightRange - item2.flightRange;
            }
            case ComfortRange : {
                return item1.comfortRange - item2.comfortRange;
            }
            case FuelConsumption : {
                return item1.fuelConsumption - item2.fuelConsumption;
            }
            default : {
                throw new IllegalArgumentException();
            }
        }
    }
}
