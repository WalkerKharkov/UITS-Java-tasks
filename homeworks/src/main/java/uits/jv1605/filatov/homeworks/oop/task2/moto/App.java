/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.moto;

/**
 *
 * @author Alex
 */
public class App {
    
    public static void main(String[] args) {
        
        BikerSet set = new BikerSet();
        System.out.println(set);
        set.sortByWeight();
        set.searchByPrice();
                
    }
    
}
