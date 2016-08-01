/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.credits;

import java.util.Arrays;
import java.util.Comparator;
import uits.jv1605.filatov.homeworks.oop.utils.GetCon;

/**
 *
 * @author Alex
 */
public class CreditSet {
    
    public int creditsNumber;
    public Credit[] set;
    
    public CreditSet(){
        this.creditsNumber = (int)(Math.round(Math.random() * 15 + 5));
        this.set = new Credit[this.creditsNumber];
        System.out.println("Your credit set :");
        for (int i = 0; i < this.creditsNumber; i++){
            this.set[i] = new Credit();
        }
        this.showList();
    }
    
    public void showList(){
        for (int i = 0; i < this.creditsNumber; i++){
            System.out.println(this.set[i]);
        }
    }
    
    public void searchBySumm(){
        System.out.println("Search credit by summ.");
        double minVal = GetCon.getDouble("Enter minimal value : ");
        double maxVal = GetCon.getDouble("Enter maximal value : ");
        for (Credit item: this.set){
            if ((item.summ >= minVal) && (item.summ <= maxVal)){
                System.out.println(item);
            }    
        }
    }
    
    public void sortCredits(){
        char mode = GetCon.getFirstChar("Enter the field for sort : (s)umm / (p)ercentage : ");
        CreditSet.CreditComparator comp = new CreditSet.CreditComparator();
        switch(mode){
            case 's':{
                comp.field = CreditSet.CreditComparator.SortingField.summ;
                break;
            }
            case 'p':{
                comp.field = CreditSet.CreditComparator.SortingField.percentage;
                break;
            }
            default:{
                System.out.println("Invalid argument!");
            }
        }
        Arrays.sort(this.set, comp);
        System.out.println("Credits, sorted by " + comp.field + " :");
        System.out.println();
        this.showList();
    }
    
    private static class CreditComparator implements Comparator <Credit>{
        
        enum SortingField {summ, percentage};
        SortingField field = SortingField.summ;
        
        @Override
        public int compare(Credit first, Credit second){
            double result;
            switch (field){
                case summ:{
                    return first.summ - second.summ;
                }
                case percentage:{
                    result = first.percentage - second.percentage;
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
