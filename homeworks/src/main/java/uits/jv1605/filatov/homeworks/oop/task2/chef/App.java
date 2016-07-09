/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.chef;

/**
 *
 * @author Alex
 */
public class App {
    
    static int num = (int)(Math.random() * 20 + 3);
    
    
    public static void main(String[] args) {
    
        Salad salad = new Salad(num);
        System.out.println(salad.toString());
        salad.sortSalad();
        salad.searchByCalorificValue();
    }
    
}
