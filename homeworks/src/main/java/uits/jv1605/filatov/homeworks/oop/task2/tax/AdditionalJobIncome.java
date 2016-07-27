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
public class AdditionalJobIncome extends JobIncome{
    
    public AdditionalJobIncome(){
        super();
        for (int i = 0; i < 12; i++){
            this.taxes[i] = this.payments[i] * this.tax;
            this.taxForPeriod += this.taxes[i];
        }
    }
    
    @Override
    public String toString(){
        return "Additional job" + super.toString();
    }
    
}
