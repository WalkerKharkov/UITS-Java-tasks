/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.candys;

import uits.jv1605.filatov.homeworks.oop.utils.GetCon;

/**
 *
 * @author Alex
 */
public class App {
    
    public static void main(String[] args) {
        
        int itemNumber = GetCon.getInteger("Enter number of candys in the gift : ");
        Candy[] candys = new Candy[itemNumber];
        int j;
        for (int i = 0; i < candys.length; i++){
            j = (int)(Math.random() * 3 + 1);
            switch(j){
                case 1:
                    candys[i] = new ChocolateCandy();
                    break;
                case 2:
                    candys[i] = new Caramel();
                    break;
                case 3:
                    candys[i] = new ChewingGum();
                    break;    
            }
        }
        
        Gift gift = new Gift(candys);
        System.out.println(gift.toString());
        gift.sortByWeight();
        gift.getCandyBySugarContent();
        
    }
    
}
