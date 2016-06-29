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
public class Train extends Transport{
    
    public TrainPlaces places;
    
    public Train(Transport transport){
        super(transport);
    }
    
    public Train(int routeNumber, SimpleTime departureTime, String destination){
        super(routeNumber, departureTime, destination);
    }
    
    public Train(int routeNumber, SimpleTime departureTime, String destination, 
          TrainPlaces places){
        super(routeNumber, departureTime, destination);
        this.places = places;
    }
    
    public Train(Transport transport, TrainPlaces places){
        super(transport);
        this.places = places;
    }
    
    public void setPlaces(TrainPlaces places){
        this.places = places;
    }
    
    public String getPlaces(){
        return this.places.toString();
    }
    
    @Override
    public String toString(){
        return "Train :\n" + super.toStringFull() + this.getPlaces();
    }
    
    public void filterApply(Filter filter){
        switch (filter.mode){
            case 'd':
                if (this.destination.equals(filter.destination)){
                    System.out.println(this.toString());
                }    
                break;
            case 'a':
                if ((this.destination.equals(filter.destination)) && 
                    (MainUtils.simpleTimeCompare(this.departureTime, filter.departureTime, '>'))){
                    System.out.println(this.toString());
                }    
                break;
        }
    }
    
}
