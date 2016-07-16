/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.bouquet;

import uits.jv1605.filatov.homeworks.oop.utils.GetCon;

/**
 *
 * @author Alex
 */
public class App {
    
    public static void main(String[] args) {
        
        int itemNumber = GetCon.getInteger("Enter number of flowers in bouquet : ");
        float accessoryPrice = 20.00f;
        String[] accessorys = {"band", "bight"};
        Flower[] flowers = new Flower[itemNumber];
        int j;
        for (int i = 0; i < flowers.length; i++){
            j = (int)(Math.random() * 3 + 1);
            switch(j){
                case 1:
                    flowers[i] = new ExoticFlower();
                    break;
                case 2:
                    flowers[i] = new GardenFlower();
                    break;
                case 3:
                    flowers[i] = new WildFlower();
                    break;    
            }
        }
        
        Accessory accessory = new Accessory(accessorys[(int)(Math.random() * (accessorys.length - 1))],
                                            (float)(Math.random() * accessoryPrice + 1));
        Bouquet bouquet = new Bouquet(flowers, accessory, "Garden dream");
        System.out.println(bouquet.showBouquet());
        bouquet.getSortByFreshness();
        bouquet.getSortByStemLength();
        
    }
    
}