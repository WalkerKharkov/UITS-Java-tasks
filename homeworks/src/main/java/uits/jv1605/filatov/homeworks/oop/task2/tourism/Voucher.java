/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.tourism;

import java.text.DecimalFormat;
import java.util.*;
/**
 *
 * @author Alex
 */
public class Voucher {
    
    public String country;
    public String voucherType;
    public double price;
    public int duration;
    public String transfer;
    public String meals;
    
    private final DecimalFormat f = new DecimalFormat("#0.00");
    
    private final static String[] COUNTRIES = {"Turkey", "Egypt", "Thailand", "Cuba", "Greece"};
    private final static String[] VOUCHER_TYPES = {"recreation", "excursions", "healing", "shopping", "cruise"};
    private final static String[] TRANSFERS = {"train", "car", "airplane", "ship"};
    private final static String[] MEALS_TYPES = {"none", "BB", "HB", "FB", "AI", "UAI"}; 
    
    private static final Map <String, Double> VOUCHER_TYPE_RATES = new HashMap();
    private static final Map <String, Double> TRANSFER_RATES = new HashMap();
    private static final Map <String, Double> COUNTRIES_RATES = new HashMap();
    private static final Map <String, Double> MEALS_TYPE_RATES = new HashMap();
    
    static{
        int i;
        for (i = 0; i < COUNTRIES.length; i++){
            COUNTRIES_RATES.put(COUNTRIES[i], (1d + i / 10));
        }
        for (i = 0; i < VOUCHER_TYPES.length; i++){
            VOUCHER_TYPE_RATES.put(VOUCHER_TYPES[i], (1d + i / 6));
        }
        for (i = 0; i < TRANSFERS.length; i++){
            TRANSFER_RATES.put(TRANSFERS[i], (1d + i / 8));
        }
        for (i = 0; i < MEALS_TYPES.length; i++){
            MEALS_TYPE_RATES.put(MEALS_TYPES[i], (1d + i / 5));
        }
    }
    
    public Voucher(){
        this.country = Voucher.COUNTRIES[(int)(Math.round(Math.random() * (Voucher.COUNTRIES.length - 1)))];
        this.voucherType = Voucher.VOUCHER_TYPES[(int)(Math.round(Math.random() * (Voucher.VOUCHER_TYPES.length - 1)))];
        this.transfer = Voucher.TRANSFERS[(int)(Math.round(Math.random() * (Voucher.TRANSFERS.length - 1)))];
        this.meals = Voucher.MEALS_TYPES[(int)(Math.round(Math.random() * (Voucher.MEALS_TYPES.length - 1)))];
        this.duration = (int)(Math.round(Math.random() * 14 + 7));
        this.price = (int)(Math.round(Math.random() * 300 + 50));
        this.price *= this.duration * Voucher.VOUCHER_TYPE_RATES.get(this.voucherType) * 
                Voucher.TRANSFER_RATES.get(this.transfer) * Voucher.COUNTRIES_RATES.get(this.country) * 
                Voucher.MEALS_TYPE_RATES.get(this.meals);
    }
    
    @Override
    public String toString(){
        return "Voucher: type - " + this.voucherType + ", country - " + this.country +
                ", duration - " + this.duration + ", transfer - " + this.transfer +
                ", meals - " + this.meals +", price - $" + f.format(this.price);
    }
    
}
