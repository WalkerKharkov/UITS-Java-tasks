/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.tourism;

import java.util.Arrays;
import java.util.Comparator;
import uits.jv1605.filatov.homeworks.oop.utils.GetCon;
/**
 *
 * @author Alex
 */
public class VoucherSet {
    
    public int voucherNumber;
    public Voucher[] set;
    
    public VoucherSet(){
        this.voucherNumber = (int)(Math.round(Math.random() * 15 + 5));
        this.set = new Voucher[this.voucherNumber];
        System.out.println("Your voucher set :");
        for (int i = 0; i < this.voucherNumber; i++){
            this.set[i] = new Voucher();
        }
        this.showList();
    }
    
    public void showList(){
        for (int i = 0; i < this.voucherNumber; i++){
            System.out.println(this.set[i]);
        }
    }
    
    public void searchByPrice(){
        System.out.println("Search voucher by price.");
        double minVal = GetCon.getDouble("Enter minimal value : ");
        double maxVal = GetCon.getDouble("Enter maximal value : ");
        for (Voucher item: this.set){
            if ((item.price >= minVal) && (item.price <= maxVal)){
                System.out.println(item);
            }    
        }
    }
    
    public void sortVouchers(){
        char mode = GetCon.getFirstChar("Enter the field for sort : (p)rice / (d)uration : ");
        VoucherSet.VoucherComparator comp = new VoucherSet.VoucherComparator();
        switch(mode){
            case 'p':{
                comp.field = VoucherSet.VoucherComparator.SortingField.price;
                break;
            }
            case 'd':{
                comp.field = VoucherSet.VoucherComparator.SortingField.duration;
                break;
            }
            default:{
                System.out.println("Invalid argument!");
            }
        }
        Arrays.sort(this.set, comp);
        System.out.println("Vouchers, sorted by " + comp.field + " :");
        System.out.println();
        this.showList();
    }
    
    private static class VoucherComparator implements Comparator <Voucher>{
        
        enum SortingField {price, duration};
        SortingField field = SortingField.price;
        
        @Override
        public int compare(Voucher first, Voucher second){
            double result;
            switch (field){
                case price:{
                    result = first.price - second.price;
                    if (result > 0){
                        return 1;
                    } else if (result < 0){
                        return -1;
                    } else {
                        return 0;
                    }
                }
                case duration:{
                    result = first.duration - second.duration;
                    if (result > 0){
                        return 1;
                    } else if (result < 0){
                        return -1;
                    } else {
                        return 0;
                    }
                }
                default:{
                    throw new IllegalArgumentException();
                }
            }
        }
        
    }
    
}
