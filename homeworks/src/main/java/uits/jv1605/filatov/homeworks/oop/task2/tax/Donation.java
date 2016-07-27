/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.tax;

/**
 *
 * @author Alex
 */
public abstract class Donation extends Tax{
    
    public String sender;
    
    private final String[] senders = {"Ivanov", "Petrov", "Sidorov", "Rotshield", "Gates", "Obama"};
    
    public Donation(){
        super();
        this.sender = this.senders[(int)(Math.round(Math.random() * (this.senders.length - 1)))];
    }
    
}
