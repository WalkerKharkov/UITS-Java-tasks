/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.coffee;

import java.util.*;
/**
 *
 * @author Alex
 */
public abstract class Coffee {
    
    public static String[] sort = {"Arabica", "Robusta", "Liberica"};
    public static final Map <String, Integer> prices = new HashMap <String, Integer> ();
    
    static{    
        prices.put("Arabica", 2000);
        prices.put("Robusta", 1500);
        prices.put("Liberica", 1200);
    }
}
