/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.transport.taxi;

import java.util.Collections;
import uits.jv1605.filatov.homeworks.oop.task2.transport.TransportComparator;

/**
 *
 * @author Alex
 */
public class App {
    
    public static void main(String[] args) {
        
        TaxiStation taxi = new TaxiStation();
        System.out.println("Your taxi station :");
        taxi.show();
        
        taxi.searchBySpeed();
        
        System.out.println("Sort by fuel consumption :");
        TransportComparator comp = new TransportComparator();
        comp.field = TransportComparator.SortField.FuelConsumption;
        Collections.sort(taxi.station, comp);
        taxi.show();
        
    }
    
}
