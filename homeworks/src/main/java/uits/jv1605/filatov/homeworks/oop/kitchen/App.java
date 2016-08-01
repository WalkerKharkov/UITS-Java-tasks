/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.kitchen;

import uits.jv1605.filatov.homeworks.oop.utils.GetCon;
import uits.jv1605.filatov.homeworks.oop.kitchen.classes.*;
import uits.jv1605.filatov.homeworks.oop.kitchen.classes.KitchenUnit;
/**
 *
 * @author Alex
 */
public class App {
    
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        kitchen();
        
    }
    
    public static void kitchen() throws IllegalAccessException, InstantiationException, ClassNotFoundException{
        
        int plantsNumber;
        Basket basket;
        KitchenUnit unit = new KitchenUnit();
        boolean exit = false;
        int mode;
        int index;
        Plant[] items;
        
        System.out.println("Hello! We will make a salad today :-)");
        plantsNumber = GetCon.getInteger("How many fruits/vegetables you want to add in the basket? : ");
        System.out.println("Your basket contains : \n------------------------------------------------");
        basket = new Basket(plantsNumber);
        basket.showBasket();
        
        while (!exit){
            
            mode = GetCon.getInteger("Enter the number of operation you want to do : \n" + 
                                     "1. Turn on the kitchen unit.\n" + 
                                     "2. Load plants from basket to kitchen unit.\n" +
                                     "3. Add plants to the basket.\n" +
                                     "4. Extract plants from basket.\n" +
                                     "5. Peell off the plants.\n" +
                                     "6. Cut the vegetables.\n" +
                                     "7. Slice the plants.\n" +
                                     "8. Exit application.\n" +
                                     "==> ");
            
            switch (mode){
                case 1: {
                    unit.turn();
                    System.out.println("Kitchen unit turned on\n ----------------------------------------------------\n");
                    break;
                }
                case 2: {
                    unit.plantsLoad(basket);
                    System.out.println("Plants loaded\n-------------------------------------------------------\n");
                    System.out.println("Plants in kitchen unit : \n-------------------------------------------------------");
                    unit.basket.showBasket();
                    basket.extract();
                    System.out.println("Plants in basket : \n------------------------------------------------------");
                    basket.showBasket();
                    break;
                }
                case 3: {
                    mode = GetCon.getInteger("Enter the number of plants you want to add : ");
                    for (int i = 0; i < mode; i++){
                        basket.put(basket.getNewPlant());
                    }
                    System.out.println("Plants added to basket\n---------------------------------------------------------\n");
                    basket.showBasket();
                    break;
                }
                case 4: {
                    mode = GetCon.getInteger("Enter the mode of extract : \n" +
                                             "1. Extract one plant by id.\n" +
                                             "2. Extract all plants.\n" +
                                             "3. Extract all fruits.\n" +
                                             "4. Extract all vegetables.\n" +
                                             "==> ");
                    switch (mode){
                        case 1:{
                            mode = GetCon.getInteger("Enter id of plant : ");
                            index = basket.getIndexById(mode);
                            if (index == -1){
                                System.out.println("This plant is not in basket!\n-----------------------------------\n");
                            }else{
                                basket.extract(index);
                            }
                            break;
                        }
                        case 2:{
                            basket.extract();
                            break;
                        }
                        case 3:{
                            basket.extractAllFruits();
                            break;
                        }
                        case 4:{
                            basket.extractAllVegetables();
                            break;
                        }
                        default:{
                            System.out.println("Invalid mode!");
                        }
                    }
                    System.out.println("Extracted\n----------------------------------------------------------------\n");
                    basket.showBasket();
                    break;
                }
                case 5: {
                    System.out.println("Basket before peelling : \n--------------------------------------------------------");
                    unit.basket.showBasket();
                    items = unit.basket.extract();
                    if (unit.peellItems(items) > 0){
                        unit.basket.put(items);
                        System.out.println("Basket after peelling : \n------------------------------------------------------");
                        unit.basket.showBasket();
                    }
                    break;
                }
                case 6: {
                    System.out.println("Basket before cutting : \n----------------------------------------------------");
                    unit.basket.showBasket();
                    items = unit.basket.extractAllVegetables();
                    if (unit.cutAll(items) > 0){
                        unit.basket.put(items);
                        System.out.println("Basket after cutting :\n----------------------------------------------------");
                        unit.basket.showBasket();
                    }
                    break;
                }
                case 7: {
                    System.out.println("Basket before slicing :\n---------------------------------------------------");
                    unit.basket.showBasket();
                    items = unit.basket.extract();
                    if (unit.sliceAll(items) > 0){
                        unit.basket.put(items);
                        System.out.println("Basket after slicing :\n---------------------------------------------------");
                        unit.basket.showBasket();
                    }    
                    break;
                }
                case 8: {
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Invalid mode!");
                }
            }
            
        }
        
        System.out.println("Good bye!");
        
    }
    
}
