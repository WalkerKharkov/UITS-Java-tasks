/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task1.transport;

import uits.jv1605.filatov.homeworks.oop.utils.Filter;
/**
 *
 * @author Alex
 */
public class Bus extends Transport{
    
    public String driverLastname;
    public String busNumber;
    public String busBrand;
    public int startYear;
    public int mileage;
    
    public Bus(Transport transport){
        this.routeNumber = transport.routeNumber;
    }
    
    public Bus(int routeNumber, String driverLastname, String busNumber,
        String busBrand, int startYear, int mileage){
        super(routeNumber);
        this.driverLastname = driverLastname;
        this.busNumber = busNumber;
        this.busBrand = busBrand;
        this.startYear = startYear;
        this.mileage = mileage;
    }
    
    public void setBus(String driverLastname, String busNumber, String busBrand,
                       short startYear, int mileage){
        this.driverLastname = driverLastname;
        this.busNumber = busNumber;
        this.busBrand = busBrand;
        this.startYear = startYear;
        this.mileage = mileage;
    }
    
    @Override
    public String toString(){
        return "Bus: \n Number: " + this.busNumber + ", brand: "+this.busBrand + "\n" +
               super.toString() + "\n" + "Start of expluatation: " + this.startYear +
               ", mileage: " + this.mileage + "\n" + "Driver: " + this.driverLastname; 
    }
    
    public void filterApply(Filter filter){
        switch (filter.mode){
            case 'r':
                if (this.routeNumber == filter.routeNumber){
                    System.out.println(this.toString());
                }    
                break;
            case 'y':
                if (this.startYear < filter.startYear){
                    System.out.println(this.toString());
                }
                break;
            case 'm':
                if (this.mileage > filter.mileage){
                    System.out.println(this.toString());
                }    
                break;
        }
    }
    
}
