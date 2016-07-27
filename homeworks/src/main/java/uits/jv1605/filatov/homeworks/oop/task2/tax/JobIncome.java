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
public abstract class JobIncome extends Tax{
    
    public JobIncome(){
        this.payments = new double[12];
        this.taxes = new double[12];
        this.tax = Tax.TAX_LIST.get(getClass().getSimpleName());
        for (int i = 0; i < 12; i++){
            this.payments[i] = (double)(Math.random() * Tax.maxSalary);
        }
    }
    
}
