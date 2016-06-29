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
public class App {
    
    public static void main(String[] args) {
        byte i;
        Short personsNumber = MainUtils.arrayLength();
        if (personsNumber < 1){
            System.exit(0);
        }
        String[] destinations = {"Rome", "Paris", "Moscow", "Berlin", "Kharkov",
                                "Vladivostok", "Zhmerinka"};
        String[] drivers = {"Ivanov I. I.", "Petrov I. P.", "Sidorov A. S.", 
                           "Shvonder A. Y.", "Poroshenko P. A.", "Katz M. Y."};
        String[] busNumbers = {"AX 1234 FE", "AX 2972 EI", "BB 6666 BB", "AH 2345 AX",
                              "AA 7777 BP"};
        String[] busBrands = {"Neoplan", "Mercedes", "Ikarus", "LAZ",
                            "Bogdan", "Shaitan-Arba"};
        String[] airplaneTypes = {"long-range", "middle-range", "short-range", 
                                 "local"};
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                             "Saturday", "Sunday"};
        Train[] trains = new Train [personsNumber];
        Bus[] buses = new Bus [personsNumber];
        Airline[] airplanes = new Airline [personsNumber];
        int trainGeneralPlaces = 180;
        int trainCoupePlaces = 300;
        int trainPlatzkartPlaces = 400;
        int trainLuxuryPlaces = 120;
        short year = MainUtils.getCurrentYear();
        int maxMileage = 500000;
        
        for (i = 0; i < personsNumber; i++){
            trains[i] = new Train(newTransportFullInit(destinations));
            trains[i].setPlaces(new TrainPlaces((int)(Math.random() * trainGeneralPlaces),
                                                (int)(Math.random() * trainCoupePlaces),
                                                (int)(Math.random() * trainPlatzkartPlaces),
                                                (int)(Math.random() * trainLuxuryPlaces)));
            buses[i] = new Bus(newTransportInit());
            buses[i].setBus(drivers[(int)(Math.random() * (drivers.length - 1))],
                            busNumbers[(int)(Math.random() * (busNumbers.length - 1))],
                            busBrands[(int)(Math.random() * (busBrands.length - 1))],
                            (short)(Math.random() * (year - 1960) + 1960),
                            (int)(Math.random() * maxMileage));
            airplanes[i] = new Airline(newTransportFullInit(destinations));
            airplanes[i].setAirplaneSettings(airplaneTypes[(int)(Math.random() * (airplaneTypes.length - 1))],
                                             weekDays[(int)(Math.random() * (weekDays.length - 1))]);
        }
        
        appExecute(trains, buses, airplanes);
    }
    
    // realization
    
    public static Transport newTransportInit(){
        return new Transport((int) (Math.random() * 99999 + 1));
    }
    
    public static Transport newTransportFullInit(String[] destination){
        return new Transport((int)(Math.random() * 99999 + 1),
                             new SimpleTime((int)(Math.random() * 24),
                                            (int)(Math.random() * 60),
                                            (int)(Math.random() * 60)),
                             destination[(int)(Math.random() * (destination.length - 1))]); 
    }
    
    public static void appExecute(Train[] trains, Bus[] buses, Airline[] airplanes){
        boolean repeat = true;
        char classList;
        
        while(repeat){
            classList = GetCon.getFirstChar("Enter type of array for work : (t)rain, " +
                                            "(b)us or (a)irline : ");
            switch (classList){
                case 't':
                    MainUtils.showAllItems(trains);
                    MainUtils.trainLists(trains);
                    break;
                case 'b':
                    MainUtils.showAllItems(buses);
                    MainUtils.busLists(buses);
                    break;
                case 'a':
                    MainUtils.showAllItems(airplanes);
                    MainUtils.airplaneLists(airplanes);
                    break;
                default:
                    System.out.println("Incorrect type!");
            }
            repeat = (GetCon.getFirstChar("One list more? (y/n) : ") != 'n');
        }
    }
    
}
