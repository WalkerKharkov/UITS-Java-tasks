/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.mobile;

import java.util.*;
import uits.jv1605.filatov.homeworks.oop.utils.GetCon;
import uits.jv1605.filatov.homeworks.oop.utils.MainUtils;

/**
 *
 * @author Alex
 */
public class MobileCompany {
    
    public ArrayList <Rate> mobileCompany = new ArrayList <Rate> ();
    public Map rateList = new HashMap();
    
    public int totalCustomers = 0;
    
    private final Set <Map.Entry> rateListSet = this.rateList.entrySet();
    
    public MobileCompany(){
        this.mobileCompany.add(new Unlimit());
        this.mobileCompany.add(new AllFor100());
        this.mobileCompany.add(new AllFor200());
        this.mobileCompany.add(new SmartEconom());
        this.mobileCompany.add(new Smartphone());
        this.mobileCompany.add(new Econom());
        
        System.out.println("Your mobile company : ");
        
        for (Rate item: mobileCompany){
            rateList.put(item.getClass().getSimpleName(), (item.rateType + ""));
            totalCustomers += item.totalRateCustomers;
            System.out.println(item);
        }
        
        System.out.println("Total customers : " + this.totalCustomers);
        System.out.println("");
        
    }
    
    public void rateListShow(){
        int i = 1;
        System.out.println("List of rates:");
        for (Map.Entry item: this.rateListSet){
            System.out.println(i + ". Name : \"" + item.getKey() + "\". Type : " + item.getValue());
            i++;
        }
        System.out.println("");
    }
    
    public void sortByRate(){
        Collections.sort(this.mobileCompany, new Comparator <Rate>(){
            @Override
            public int compare(Rate first, Rate second){
                return first.subscriptionFee - second.subscriptionFee;
            }
        });
        System.out.println("Sorting by subscription fee : ");
        for (Rate item: this.mobileCompany){
            System.out.println(item);
        }
        System.out.println("");
    }
    
    public void searchByInternetTraffic(){
        System.out.println("Search rate by internet traffic.");
        int minVal = GetCon.getInteger("Enter minimal value : ");
        int maxVal = GetCon.getInteger("Enter maximal value : ");
        for (Rate item: this.mobileCompany){
            if (MainUtils.inRange(item.internetTrafficVolume, minVal, maxVal)){
                System.out.println(item);
            }    
        }
    }
    
}
