/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.account;

import java.text.DecimalFormat;


/**
 *
 * @author Alex
 */
public class Account {
    
    public long number;
    public double balance;
    public boolean blocked;
    
    private final static long MAX_NUMBER = 999999999999l;
    private final static double MAX_BALANCE = 1000000;
    
    private final DecimalFormat f = new DecimalFormat("#0.00");
    
    public Account(){
        this.number = Math.round(Math.random() * Account.MAX_NUMBER);
        this.balance = Math.round(Math.random() * Account.MAX_BALANCE);
        this.blocked = Math.random() > .8;
        this.balance = (Math.random() > .7) ? -this.balance : this.balance;
    }
    
    @Override
    public String toString(){
        return "Account № " + this.number + ". Balance : $" + f.format(this.balance) +
                " Blocked : " + ((this.blocked) ? "yes" : "no");
    }
    
}
