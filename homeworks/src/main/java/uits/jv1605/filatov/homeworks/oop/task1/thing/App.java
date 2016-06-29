/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task1.thing;

import uits.jv1605.filatov.homeworks.oop.utils.GetCon;
import uits.jv1605.filatov.homeworks.oop.utils.MainUtils;
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
        String[] bookNames = {"Bukvar", "Voina i mir", "Tri porosenka", "Kobzar", "Mein kampf",
                             "Vlastelin kolec", "Kniga o vkusnoi i zdorovoi pishe"};
        String[] authors = {"Dostoyevskyi", "Tolkien", "Barto", "Pushkin", "Mr. Andersen", 
                            "Brezhnev"};
        String[] publishings = {"Prapor", "Krasnyi Oktyabr", "Kharkov"};
        String[] covers = {"soft", "hard"};
        String[] streets = {"Lenina", "Sovetskaya", "Pushkina", "Zarechnaya",
                            "Tupik Kommunizma", "5th avenu", "Monmartr"};
        String[] buildingTypes = {"redbrick", "panel"};
        String[] numbers = {"AX 1234 FE", "AX 2972 EI", "BB 6666 BB", "AH 2345 AX",
                            "AA 7777 BP"};
        String[] brands = {"Bentley", "Mercedes", "BMW", "ZAZ", "Honda", "Shaitan-Arba"};
        String[] models = {"ML 350", "Civic", "968M", "X5", "Pobeda", "TT"};
        String[] colors = {"white", "black", "silver", "red", "gold", "blue", "cherry"};
        String[] productNames = {"cookie", "chokolate", "cola", "sausage", "bread",
                                 "oil", "vodka"};
        String[] manufacturers = {"Nemiroff", "Pepsico", "Roshen", "XMK", "Milka",
                                  "Finlandia"};
        Book[] books = new Book [personsNumber];
        House[] houses = new House [personsNumber];
        Car[] cars = new Car [personsNumber];
        Product[] products = new Product [personsNumber];
        short year = MainUtils.getCurrentYear();
        short pages = 1000;
        short apartments = 300;
        float square = 500;
        byte floors = 50;
        byte roomsNumber = 10;
        byte exploitTerm = 100;
        byte carAge = 50;
        short maxTerm = 24;
        long UPC = 999999999998l;
        
        for (i = 0; i < personsNumber; i++){
            books[i] = new Book(thingInit(i+1));
            books[i].setBookSettings(bookNames[(int)(Math.random() * (bookNames.length - 1))],
                                     authors[(int)(Math.random() * (authors.length - 1))],
                                     publishings[(int)(Math.random() * (publishings.length - 1))],
                                     (short)(Math.random() * (year - 1800) + 1800),
                                     (short)(Math.random() * (pages - 20) + 20),
                                     covers[(int)(Math.random() * (covers.length - 1))]);
            houses[i] = new House(thingInit(i+1));
            houses[i].setHouseSettings((short)(Math.random() * (apartments - 1) + 1),
                                       (float)(Math.random() * (square - 30) + 30),
                                       (byte)(Math.random() * (floors - 1) + 1),
                                       (byte)(Math.random() * (roomsNumber - 1) + 1),
                                       streets[(int)(Math.random() * (streets.length - 1))],
                                       buildingTypes[(int)(Math.random() * (buildingTypes.length - 1))],
                                       (byte)(Math.random() * exploitTerm));
            cars[i] = new Car(thingInit(i+1));
            cars[i].setCarSettings(brands[(int)(Math.random() * (brands.length - 1))],
                                   models[(int)(Math.random() * (models.length - 1))],
                                   (short)(year - (Math.random() * carAge)),
                                   colors[(int)(Math.random() * (colors.length - 1))],
                                   numbers[(int)(Math.random() * (numbers.length - 1))]);
            products[i] = new Product(thingInit(i+1));
            products[i].setProductSettings(productNames[(int)(Math.random() * (productNames.length - 1))],
                                           (long)(Math.random() * UPC + 1),
                                           manufacturers[(int)(Math.random() * (manufacturers.length - 1))],
                                           (short)(Math.random() * (maxTerm - 1) + 1));
        }
        
        appExecute(books, houses, cars, products);
    }
    
    // realization
    
    public static Thing thingInit(int id){
        return new Thing(id, (float)(Math.random() * 1000 + 1));
    }
    
    public static void appExecute(Book[] books, House[] houses, Car[] cars, Product[] products){
        boolean repeat = true;
        char classList;
        
        while(repeat){
            classList = GetCon.getFirstChar("Enter type of array for work : (b)ooks, " +
                                            "(h)ouses, (c)ars or (p)roducts : ");
            switch (classList){
                case 'b':
                    MainUtils.showAllItems(books);
                    MainUtils.bookLists(books);
                    break;
                case 'h':
                    MainUtils.showAllItems(houses);
                    MainUtils.houseLists(houses);
                    break;
                case 'c':
                    MainUtils.showAllItems(cars);
                    MainUtils.carLists(cars);
                    break;
                case 'p':
                    MainUtils.showAllItems(products);
                    MainUtils.productLists(products);
                    break;
                default:
                    System.out.println("Incorrect type!");
            }
            repeat = (GetCon.getFirstChar("One list more? (y/n) : ") != 'n');
        }
    }
 
    
}
