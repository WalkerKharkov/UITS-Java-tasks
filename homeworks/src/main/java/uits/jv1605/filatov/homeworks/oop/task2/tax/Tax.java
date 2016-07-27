/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.tax;

import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author Alex
 */
public abstract class Tax {
    
    public double tax;
    public double taxForPeriod = 0;
    public double[] payments;
    public double[] taxes;
    
    public static int year;
    public static double maxSalary = 10000;
    public static double maxPayment = 100000;
    public static final Map <String, Double> TAX_LIST = new HashMap();
    
    private final DecimalFormat f = new DecimalFormat("#0.00");
    
    static{
        Calendar calend = Calendar.getInstance();
        Tax.year = calend.get(calend.YEAR);
        TAX_LIST.put("MainJobIncome", .2);
        TAX_LIST.put("AdditionalJobIncome", .3);
        TAX_LIST.put("Royalty", .1);
        TAX_LIST.put("PropertySale", .05);
        TAX_LIST.put("MoneyDonation", .05);
        TAX_LIST.put("PropertyDonation", .05);
        TAX_LIST.put("ForeignTransfer", .15);
        TAX_LIST.put("MaterialAid", .01);
        TAX_LIST.put("ChildrenAllowance", .01);
    }
    
    public Tax(){
        int rand = (int)(Math.round(Math.random() * 12));
        this.payments = new double[rand];
        this.taxes = new double[rand];
        try{
            this.tax = Tax.TAX_LIST.get(getClass().getSimpleName());
        }catch (NullPointerException e){
            System.err.println("Invalid tax name detected!");
            System.exit(1);
        }
        for (int i = 0; i < rand; i++){
            this.payments[i] = (double)(Math.random() * Tax.maxPayment);
            this.taxes[i] = this.payments[i] * this.tax;
            this.taxForPeriod += this.taxes[i];
        }
    }
    
    @Override
    public String toString(){
        String result = " tax for " + Tax.year + " year : \n\n";
        for (int i = 0; i < this.payments.length; i++){
            result += (i + 1) + ". Payments : " + f.format(this.payments[i]) + ", tax (" + 
                    this.tax * 100 + "%) : " + f.format(this.taxes[i]) + ".\n";
        }
        return result + "\nTotal tax for period : " + f.format(this.taxForPeriod) + "\n\n";
    }
}
