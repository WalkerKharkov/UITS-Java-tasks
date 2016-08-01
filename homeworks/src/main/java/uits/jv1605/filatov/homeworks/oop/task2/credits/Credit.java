/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.credits;

import java.text.DecimalFormat;
/**
 *
 * @author Alex
 */
public class Credit {
    
    public int summ;
    public double percentage;
    public String bankName;
    public String creditName;
    public boolean advancedRepayment;
    public boolean increaseCreditLine;
    public int increaseTo;
    
    private final DecimalFormat f = new DecimalFormat("#0.00");
    
    private final static String[] BANK_NAMES = {"Privatbank", "UkrSibBank", "Pireus", "Rodovid", "Ukrsocbank"};
    private final static String[] CREDIT_NAMES = {"start", "extended", "prodai_pochku", "pizdec_kvartire"};
    
    public Credit(){
        this.bankName = Credit.BANK_NAMES[(int)(Math.round(Math.random() * (Credit.BANK_NAMES.length - 1)))];
        this.creditName = Credit.CREDIT_NAMES[(int)(Math.round(Math.random() * (Credit.CREDIT_NAMES.length - 1)))];
        this.summ = (int)(Math.round(Math.random() * 9 + 1)) * 100000;
        this.percentage = (double)(Math.round(Math.random() * 20 + 1));
        this.advancedRepayment = (Math.random() > .5);
        this.increaseCreditLine = (Math.random() > .5);
        if (this.increaseCreditLine){
            this.increaseTo = this.summ * (int)(Math.round(Math.random() * 4 + 1));
        }
    }
    
    @Override
    public String toString(){
        String result = "Credit \"" + this.creditName + "\", by bank \"" + this.bankName + "\", maximal summ : " +
                this.summ + ", percentage : " + this.percentage + "%, possibility of advanced repayments : " +
                this.advancedRepayment + ", possiblity of increase credit line : " + this.increaseCreditLine;
        if (this.increaseCreditLine){
            result += ", increase to " + this.increaseTo;
        }
        return result;
    }
    
}
