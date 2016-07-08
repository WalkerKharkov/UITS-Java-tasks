/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.utils;

import uits.jv1605.filatov.homeworks.oop.task1.thing.House;
import uits.jv1605.filatov.homeworks.oop.task1.thing.Book;
import uits.jv1605.filatov.homeworks.oop.task1.thing.Product;
import uits.jv1605.filatov.homeworks.oop.task1.thing.Car;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import uits.jv1605.filatov.homeworks.oop.task1.person.*;
import uits.jv1605.filatov.homeworks.oop.task1.transport.*;
//import uits.jv1605.filatov.homeworks.oop.task2.bouquet.Flower;

/**
 *
 * @author Alex
 */
public class MainUtils {
    
    // public methods
    
    public static void studentLists (Student[] students){
        Filter filter = new Filter();
        
        filter.mode = GetCon.getString("Enter the mode of list - (f)aculty, faculty & " +
                                       "(c)ourse, (y)ear or (g)roup : ").charAt(0);
        switch(filter.mode){
            case 'f':
                filter.faculty = GetCon.getString("Enter the faculty : ");
                break;
            case 'c':
                filter.faculty = GetCon.getString("Enter the faculty : ");
                filter.course = GetCon.getByte("Enter the course : ");
                break;
            case 'y':
                filter.year = GetCon.getShort("Enter the year of birth : ");
                break;
            case 'g':
                filter.faculty = GetCon.getString("Enter the faculty : ");
                filter.group = GetCon.getByte("Enter the group : ");
                break;
            default:
                System.out.println("Incorrect mode!");
                System.out.println();
        }
        for (Student student: students){
            student.filterApply (filter);
        }
    }
    
    public static void customerLists(Customer[] customers){
        char mode;
        long minVal, maxVal;
        
        mode = GetCon.getFirstChar("Enter the mode of list - (a)lphabetical or credit card "+
                                   "number (r)ange : ");
        switch(mode){
            case 'a':
                Customer[] sortedCustomers = bubbleSortToAlphabetical(customers);
                for (Customer customer: sortedCustomers){
                    System.out.println(customer);
                }
                break;
            case 'r':
                minVal = GetCon.getLong("Enter the min value : ");
                maxVal = GetCon.getLong("Enter the max value : ");
                for (Customer customer: customers){
                    if (inRange(customer.creditCardNumber, minVal, maxVal)){
                        System.out.println(customer);
                    }    
                }
                break;
        }
    }
    
    public static void patientLists(Patient[] patients){
        Filter filter = new Filter();
        int minVal, maxVal;
        
        filter.mode = GetCon.getFirstChar("Enter the mode of list - (d)iagnosis or (m)edical card "+
                                          "number range: ");
        switch(filter.mode){
            case 'd':
                filter.diagnosis = GetCon.getString("Enter the diagnosis : ");
                for (Patient patient: patients){
                    patient.filterApply (filter);
                }
                break;
            case 'm':
                minVal = GetCon.getInteger("Enter the min value : ");
                maxVal = GetCon.getInteger("Enter the max value : ");
                for (Patient patient: patients){
                    if (inRange(patient.medicalCardNumber, minVal, maxVal)){
                        System.out.println(patient);
                    }    
                }
                break;
        }
    }
    
    public static void abiturientLists(Abiturient[] abiturients){
        Filter filter = new Filter();
        
        filter.mode = GetCon.getFirstChar("Enter the mode of list - (f)ailing grade, (b)igger summ, "+
                                          "(m)ax summ or (h)alf-passing summ : ");
        switch(filter.mode){
            case 'f':
                break;
            case 'b':
                filter.sum = GetCon.getShort("Enter sum of marks : ");
                break;
            case 'm':
                filter.numAbiturients = GetCon.getShort("Enter the number of abiturients : ");
                Abiturient[] sortedAbiturients = bubbleSortByMaxSum(abiturients);
                for (int i = sortedAbiturients.length - 1; 
                     i > sortedAbiturients.length - filter.numAbiturients - 1; i--){
                    System.out.println(sortedAbiturients[i]);
                }
                break;
            case 'h':
                filter.passingSum = GetCon.getShort("Enter passing sum of marks : ");
                break;
        }
        for (Abiturient abiturient: abiturients){
            abiturient.filterApply(filter);
        }
    }
    
    public static void phoneLists(Phone[] phones){
        Filter filter = new Filter();
        
        filter.mode = GetCon.getFirstChar("Enter the mode of list - (l)ocal speaking time, " + 
                                          "(i)ntercity speaking or (a)lphabetical : ");
        switch(filter.mode){
            case 'i':
                for (Phone phone: phones){
                    phone.filterApply(filter);
                }
                break;
            case 'l':
                filter.speakingTime = timeParse(GetCon.getString("Enter time (hh:mm:ss) : "));
                for (Phone phone: phones){
                    phone.filterApply(filter);
                }
                break;
            case 'a':
                Phone[] sortedPhones = bubbleSortToAlphabetical(phones);
                for (Phone phone: sortedPhones){
                    System.out.println(phone);
                }
                break;
        }
    }
    
    public static void trainLists(Train[] trains){
        Filter filter = new Filter();
        
        filter.mode = GetCon.getFirstChar("Enter the mode of list - (d)estination or destination and" +
                                          "(a)fter time : ");
        switch(filter.mode){
            case 'd':
                filter.destination = GetCon.getString("Enter destination : ");
                break;
            case 'a':
                filter.destination = GetCon.getString("Enter destination : ");
                filter.departureTime = timeParse(GetCon.getString("Enter departure time (hh:mm:ss) : "));
                break;
        }
        for (Train train: trains){
            train.filterApply(filter);
        }
    }
    
    public static void busLists(Bus[] buses){
        Filter filter = new Filter();
        
        filter.mode = GetCon.getFirstChar("Enter the mode of list - (r)oute, working (y)ears or " +
                                   "(m)ileage : ");
        switch(filter.mode){
            case 'r':
                filter.routeNumber = GetCon.getInteger("Enter route : ");
                break;
            case 'y':
                filter.startYear = getCurrentYear() - GetCon.getShort("Enter number of bus working years : ");
                break;
            case 'm':
                filter.mileage = GetCon.getInteger("Enter mileage : ");
                break;    
        }
        for (Bus bus: buses){
            bus.filterApply(filter);
        }
    }
    
    public static void airplaneLists(Airline[] airplanes){
        Filter filter = new Filter();
        
        filter.mode = GetCon.getFirstChar("Enter the mode of list - (d)estination, (w)eekday or " +
                                          "weekday and departure (t)ime : ");
        switch(filter.mode){
            case 'd':
                filter.destination = GetCon.getString("Enter destination : ");
                break;
            case 'w':
                filter.weekDays = GetCon.getString("Enter weekday of routes : ");
                break;
            case 't':
                filter.weekDays = GetCon.getString("Enter weekday of routes : ");
                filter.departureTime = timeParse(GetCon.getString("Enter departure time : "));
                break;    
        }
        for (Airline airplane: airplanes){
            airplane.filterApply(filter);
        }
    }
    
    public static void bookLists(Book[] books){
        Filter filter = new Filter();
        
        filter.mode = GetCon.getFirstChar("Enter the mode of list - (a)uthors, (p)ublishing or " +
                                          "publishing (y)ear : ");
        switch(filter.mode){
            case 'a':
                filter.authors = GetCon.getString("Enter authors : ");
                break;
            case 'p':
                filter.publishing = GetCon.getString("Enter publishing : ");
                break;
            case 'y':
                filter.publishingYear = GetCon.getShort("Enter year of publishing : ");
                break;    
        }
        for (Book book: books){
            book.filterApply(filter);
        }
    }
    
    public static void houseLists(House[] houses){
        Filter filter = new Filter();
        byte minVal, maxVal;
        
        filter.mode = GetCon.getFirstChar("Enter the mode of list - (r)ooms number, rooms number and (f)loor " +
                                          "range or (s)quare : ");
        switch(filter.mode){
            case 'a':
                filter.roomsNumber = GetCon.getByte("Enter rooms number : ");
                for (House house: houses){
                    if (house.roomsNumber == filter.roomsNumber){
                        System.out.println(house);
                    }    
                }
                break;
            case 'p':
                filter.roomsNumber = GetCon.getByte("Enter rooms number : ");
                minVal = GetCon.getByte("Enter the min value : ");
                maxVal = GetCon.getByte("Enter the max value : ");
                for (House house: houses){
                    if ((inRange(house.floor, minVal, maxVal)) && house.roomsNumber == filter.roomsNumber){
                        System.out.println(house);
                    }    
                }
                break;
            case 'y':
                filter.square = GetCon.getFloat("Enter square : ");
                for (House house: houses){
                    if (house.apartmentSquare > filter.square){
                        System.out.println(house);
                    }    
                }
                break;    
        }
    }
    
    public static void carLists(Car[] cars){
        Filter filter = new Filter();
        
        filter.mode = GetCon.getFirstChar("Enter the mode of list - (b)rand, (m)odel or " +
                                          "(y)ear : ");
        switch(filter.mode){
            case 'b':
                filter.brand = GetCon.getString("Enter brand : ");
                break;
            case 'm':
                filter.model = GetCon.getString("Enter model : ");
                filter.expYears = GetCon.getByte("Enter number of years : ");
                break;
            case 'y':
                filter.year = GetCon.getByte("Enter year : ");
                filter.price = GetCon.getFloat("Enter price : ");
                break;    
        }
        for (Car car: cars){
            car.filterApply(filter);
        }
    }
    
    public static void productLists(Product[] products){
        Filter filter = new Filter();
        
        filter.mode = GetCon.getFirstChar("Enter the mode of list - (n)ame, name and (p)rice or " +
                                          "exploitation (t)erms : ");
        switch(filter.mode){
            case 'n':
                filter.name = GetCon.getString("Enter name : ");
                break;
            case 'p':
                filter.name = GetCon.getString("Enter name : ");
                filter.price = GetCon.getFloat("Enter price : ");
                break;
            case 't':
                filter.storageMonthes = GetCon.getShort("Enter exploitation terms (in monthes) : ");
                break;    
        }
        for (Product product: products){
            product.filterApply(filter);
        }
    }
    
    public static boolean simpleTimeCompare(SimpleTime firstTime, SimpleTime secondTime, char mode){
        boolean firstTimeBigger = false;
        boolean timesMatches = ((firstTime.hours == secondTime.hours) &&
                                (firstTime.minutes == secondTime.minutes) &&
                                (firstTime.seconds == secondTime.seconds));
        if (firstTime.hours > secondTime.hours){
                    firstTimeBigger = true;
                }else if (firstTime.hours == secondTime.hours){
                    if (firstTime.minutes > secondTime.minutes){
                        firstTimeBigger = true;
                    }else if (firstTime.minutes == secondTime.minutes){
                        if (firstTime.seconds > secondTime.seconds){
                            firstTimeBigger = true;
                        }
                    }
                }
        switch (mode){
            case '=':
                return timesMatches;
            case '>':
                return firstTimeBigger;
            case '<':    
                if (timesMatches){
                    return false;
                }
                return !firstTimeBigger;
            default:
                return false;
        }        
    }    
    
    public static boolean simpleDateCompare(SimpleDate firstDate, SimpleDate secondDate, char mode){
        boolean firstDateBigger = false;
        boolean datesMatches = ((firstDate.year == secondDate.year) &&
                                (firstDate.month == secondDate.month) &&
                                (firstDate.day == secondDate.day));
        if (firstDate.year > secondDate.year){
                    firstDateBigger = true;
                }else if (firstDate.year == secondDate.year){
                    if (firstDate.month > secondDate.month){
                        firstDateBigger = true;
                    }else if (firstDate.month == secondDate.month){
                        if (firstDate.day > secondDate.day){
                            firstDateBigger = true;
                        }
                    }
                }
        switch (mode){
            case '=':
                return datesMatches;
            case '>':
                return firstDateBigger;
            case '<':    
                if (datesMatches){
                    return false;
                }
                return !firstDateBigger;
            default:
                return false;
        }        
    }
    
    public static short arrayLength(){
        return GetCon.getShort("Enter the number of items in array: ");
    }
    
    public static short getCurrentYear(){
        return new Short((new SimpleDateFormat("yyyy")).format(new Date()));
    }
    
    public static <Type> void showAllItems(Type[] arr){
        for (Type item: arr){
            System.out.println(item.toString());
        }    
        System.out.println();
    }
    
    public static boolean inRange(long value, long minVal, long maxVal){
        return ((value >= minVal) && (value <= maxVal));
    }
    
    // private methods
    
    private static <ExtPerson extends Person> ExtPerson[] bubbleSortToAlphabetical(ExtPerson[] array){
        int i, j;
        ExtPerson buffer;
        for (i = array.length - 1; i >= 0; i--){
            for (j = 0; j < i; j++){
                if (array[j].lastName.compareTo(array[j + 1].lastName) > 1){
                    buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }else if (array[j].lastName.compareTo(array[j + 1].lastName) == 0){
                        if (array[j].name.compareTo(array[j + 1].name) > 1){
                            buffer = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = buffer;
                        }else if (array[j].name.compareTo(array[j + 1].name) == 0){
                                if (array[j].middleName.compareTo(array[j + 1].middleName) > 1){
                                    buffer = array[j];
                                    array[j] = array[j + 1];
                                    array[j + 1] = buffer;
                                }
                        }
                        
                }
                
            }
        }
        return array; 
    }
    
    private static Abiturient[] bubbleSortByMaxSum(Abiturient[] abiturients){
        int i, j;
        Abiturient buffer;
        for (i = abiturients.length - 1; i >= 0; i--){
            for (j = 0; j < i; j++){
                if (abiturients[j].sum > abiturients[j + 1].sum){
                    buffer = abiturients[j];
                    abiturients[j] = abiturients[j + 1];
                    abiturients[j + 1] = buffer;
                }
            }
        }
        return abiturients; 
    }
    
    private static SimpleTime timeParse(String time){
        String[] timeArray = Pattern.compile(":").split(time);
        return new SimpleTime(Integer.valueOf(timeArray[0]),
                              Integer.valueOf(timeArray[1]),
                              Integer.valueOf(timeArray[2]));
        }
    
}
