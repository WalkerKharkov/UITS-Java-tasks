/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.appliances;

import java.util.Arrays;
import uits.jv1605.filatov.homeworks.oop.utils.GetCon;
import uits.jv1605.filatov.homeworks.oop.utils.MainUtils;
/**
 *
 * @author Alex
 */
public class App {
    
    static int num = 10;
    static Appliance[] apartment = new Appliance[num];
        
    static{
        int rand;
        
        for (int i = 0; i < num; i++){
            rand = (byte)(Math.random() * 3 + 1);
            switch(rand){
                case(1) : {
                    apartment[i] = new Kitchen();
                    break;
                }
                case(2) : {
                    apartment[i] = new Entertainment();
                    break;
                }
                case(3) : {
                    apartment[i] = new Service();
                    break;
                }    
            }
            rand = (int)(Math.random() * 2 + 1);
            switch(rand){
                case(2) : {
                    apartment[i].turnOn();
                }
            }
            System.out.println(apartment[i].toString());    
        }
    }
    
    public static void getAllPower(Appliance[] apartment){
        int power = 0;
        System.out.println();
        System.out.println("----------------Summary power of appliances which turned on-----------------------");
        for (Appliance appliance: apartment){
            if (appliance.turned){
                System.out.println(appliance);
                power += appliance.getPower();
            }
        }
        System.out.println();
        System.out.println("Summary power : " + power + "W");
        System.out.println();
    }

    public static void getSortByPower(Appliance[] apartment){
        Appliance.AppComparator comparator = new Appliance.AppComparator();
        Arrays.sort(apartment, comparator);
        System.out.println();
        System.out.println("-----------Sorted by power--------------");
        for (Appliance appliance: apartment){
            System.out.println(appliance.toString());
        }
        System.out.println();
    }
    
    public static void searchByPriceRange(Appliance[] apartment){
        int minPrice = GetCon.getInteger("Enter minimal price : ");
        int maxPrice = GetCon.getInteger("Enter maximal price : ");
        System.out.println();
        System.out.println("Search by price range");
        for (Appliance appliance: apartment){
            if (MainUtils.inRange(appliance.price, minPrice, maxPrice)){
                System.out.println(appliance.toString());
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        getAllPower(apartment);
        getSortByPower(apartment);
        searchByPriceRange(apartment);
        
    }
    
}
