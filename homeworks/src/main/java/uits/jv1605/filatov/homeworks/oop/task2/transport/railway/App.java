/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.transport.railway;

import java.util.Collections;
import uits.jv1605.filatov.homeworks.oop.task2.transport.TransportComparator;

/**
 *
 * @author Alex
 */
public class App {
    
    public static void main(String[] args) {
        
        Train train = new Train();
        System.out.println("Your train :");
        train.show();
        
        train.searchByPassengersNumber();
        
        System.out.println("Sort by comfort range :");
        TransportComparator comp = new TransportComparator();
        comp.field = TransportComparator.SortField.ComfortRange;
        Collections.sort(train.train, comp);
        train.show();
        
    }
    
}
