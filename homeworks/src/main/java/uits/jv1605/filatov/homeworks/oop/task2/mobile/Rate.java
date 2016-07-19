/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.mobile;

/**
 *
 * @author Alex
 */
public abstract class Rate {
    
    public enum RateType{Prepaid, Contract};
    
    public int subscriptionFee;
    public int totalRateCustomers;
    public int internetTrafficVolume;
    public RateType rateType;
    
    public Rate(){
        this.totalRateCustomers = (int)(Math.random() * 1000);
    }
    
    @Override
    public String toString(){
        return this.rateType + " rate  '" + this.getClass().getSimpleName() + "'. " +
               "Subscriptions fee : " + this.subscriptionFee + ", internet traffic volume : " +
               this.internetTrafficVolume + ", total customers : " + this.totalRateCustomers;
    }
    
}
