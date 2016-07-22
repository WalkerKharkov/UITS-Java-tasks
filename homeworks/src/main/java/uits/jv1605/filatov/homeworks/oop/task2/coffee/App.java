/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.coffee;

/**
 *
 * @author Alex
 */
public class App {
    
    public static void main(String[] args) {
        
        CoffeeVan van = new CoffeeVan();
        
        van.sortByPriceAndWeight();
        van.searchByQuality();
        
    }
    
}
