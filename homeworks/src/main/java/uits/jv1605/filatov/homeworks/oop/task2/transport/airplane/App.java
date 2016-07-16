/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.transport.airplane;

import java.util.Collections;
import uits.jv1605.filatov.homeworks.oop.task2.transport.TransportComparator;

/**
 *
 * @author Alex
 */
public class App {
    
    public static void main(String[] args) {
        
        Airline airline = new Airline();
        System.out.println("Your airline:");
        airline.show();
        
        airline.searchByFuelConsumption();
        
        System.out.println("Sort by flight range :");
        TransportComparator comp = new TransportComparator();
        comp.field = TransportComparator.SortField.FlightRange;
        Collections.sort(airline.airline, comp);
        airline.show();
        
    }
    
}
