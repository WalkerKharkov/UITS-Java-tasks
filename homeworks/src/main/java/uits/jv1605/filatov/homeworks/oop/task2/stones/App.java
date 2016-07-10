/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.stones;

import uits.jv1605.filatov.homeworks.oop.task2.soundrecord.CDRom;

/**
 *
 * @author Alex
 */
public class App {
    
    static int num = (int)(Math.random() * 15 + 3);
    
    public static void main(String[] args) {
        
        Necklace necklace = new Necklace(num);
        System.out.println(necklace);
        necklace.sortByPrice();
        necklace.searchByTransparency();
        
    }
    
}
