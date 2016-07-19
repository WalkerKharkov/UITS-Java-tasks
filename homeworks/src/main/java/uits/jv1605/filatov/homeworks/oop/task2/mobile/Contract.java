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
public abstract class Contract extends Rate{
    
    public Contract(){
        super();
        this.rateType = RateType.Contract;
    }
    
}
