/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task1.transport;

import uits.jv1605.filatov.homeworks.oop.utils.*;
/**
 *
 * @author Alex
 */
public class Airline extends Transport{
    
    public String airplaneType;
    public String weekDays;

    public Airline(Transport transport) {
        super(transport);
    }
    
    public Airline(Transport transport, String airplaneType, String weekDays) {
        super(transport);
        this.airplaneType = airplaneType;
        this.weekDays = weekDays;
    }
    
    public void setAirplaneSettings(String airplaneType, String weekDays) {
        this.airplaneType = airplaneType;
        this.weekDays = weekDays;
    }
    
    public String getAirplaneData(){
        return "Type of this airplane: " + this.airplaneType + "\n" +
               "Airplane is flying by " + this.weekDays;
    }
    
    @Override
    public String toString(){
        return "Airplain :\n" + super.toStringFull() + this.getAirplaneData();
    }
        
    public void filterApply(Filter filter){
        switch (filter.mode){
            case 'd':
                if (this.destination.equals(filter.destination)){
                    System.out.println(this.toString());
                }    
                break;
            case 'w':
                if (this.weekDays.equals(filter.weekDays)){
                    System.out.println(this.toString());
                }
                break;
            case 't':
                if (this.weekDays.equals(filter.weekDays) &&
                    MainUtils.simpleTimeCompare(this.departureTime, filter.departureTime, '>')){
                    System.out.println(this.toString());
                }    
                break;
        }
    }
    
}
