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
public class TaxList {
    
    public double totalTaxSumm = 0;
    public Tax tax;
    
    public ArrayList <Tax> taxList = new ArrayList();
    
    private final DecimalFormat f = new DecimalFormat("#0.00");
    
    public TaxList(){
        
        this.tax = new MainJobIncome();
        this.pushTaxInList(this.tax);
        this.tax = new AdditionalJobIncome();
        this.pushTaxInList(this.tax);
        this.tax = new Royalty();
        this.pushTaxInList(this.tax);
        this.tax = new PropertySale();
        this.pushTaxInList(this.tax);
        this.tax = new MoneyDonation();
        this.pushTaxInList(this.tax);
        this.tax = new PropertyDonation();
        this.pushTaxInList(this.tax);
        this.tax = new ForeignTransfer();
        this.pushTaxInList(this.tax);
        this.tax = new MaterialAid();
        this.pushTaxInList(this.tax);
        this.tax = new ChildrenAllowance();
        this.pushTaxInList(this.tax);
        
        System.out.println(this.toString());
        
    }
    
    public void sortByTotalTaxSumm(){
        Collections.sort(this.taxList, new Comparator <Tax>(){
            @Override
            public int compare(Tax first, Tax second){
                double result;
                result = first.taxForPeriod - second.taxForPeriod;
                if (result > 0){
                    return 1;
                } else if (result < 0){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("");
        System.out.println("Sorting by total tax payments : ");
        for (Tax item: this.taxList){
            System.out.println("Tax payment for " + item.getClass().getSimpleName() +
                    ", payment : " + f.format(item.taxForPeriod));
        }
        System.out.println("");
        System.out.println("Total tax payment : " + f.format(this.totalTaxSumm));
    }
    
    private void pushTaxInList(Tax tax){
        this.taxList.add(tax);
        this.totalTaxSumm += tax.taxForPeriod;
    }
    
    @Override
    public String toString(){
        String result = "Total tax list for " + Tax.year + " year.\n\n";
        for (Tax tax: this.taxList){
            result += tax.toString();
        }
        return result + "Total tax payment : " + f.format(this.totalTaxSumm) + "\n\n";
    }
    
}
