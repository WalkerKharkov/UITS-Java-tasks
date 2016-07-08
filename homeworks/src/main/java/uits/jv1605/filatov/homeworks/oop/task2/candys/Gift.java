/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.candys;

import uits.jv1605.filatov.homeworks.oop.utils.GetCon;
import uits.jv1605.filatov.homeworks.oop.utils.MainUtils;

/**
 *
 * @author Alex
 */
public class Gift <TypeCandy extends Candy>{
    
    public int weight = 0;
    TypeCandy[] candys;
    public float price = 0;
    public int candysNumber;
    
    public Gift(){}
    
    public Gift(TypeCandy[] candys){
        this.candys = candys;
        this.candysNumber = candys.length;
        for (TypeCandy candy: candys){
            this.weight += candy.weight;
            this.price += candy.price;
        }
    }
    
    public void getCandyBySugarContent(){
        int minVal = GetCon.getInteger("Enter minimal sugar content : ");
        int maxVal = GetCon.getInteger("Enter maximal sugar content : ");
        for (TypeCandy candy: this.candys){
            if (MainUtils.inRange(candy.sugarContent, minVal, maxVal)){
                System.out.println("This candy is in range of sugar content : " + 
                                   candy.name + ", sugar content : " + candy.sugarContent + "g.");
            }
        }
    }
    
    public void sortByWeight(){
        int i, j;
        TypeCandy buffer;
        for (i = this.candys.length - 1; i >= 0; i--){
            for (j = 0; j < i; j++){
                if (this.candys[j].weight > this.candys[j + 1].weight){
                    buffer = this.candys[j];
                    this.candys[j] = this.candys[j + 1];
                    this.candys[j + 1] = buffer;
                }
            }
        }
        System.out.println("Gift sorted by weight of candys :");
        System.out.println();
        for (TypeCandy candy: this.candys){
            System.out.println("Candy : " + candy.name + ", its weight : " + candy.weight);
        }
        System.out.println();
    }
    
    @Override
    public String toString(){
        return "Gift : " + this.candysNumber + " pcs, weight : " + this.weight + " g.\n" +
               "Contains " + this.getCandysNumber() + "\nPrice : " + this.price + "\n";
    }
    
    private String getCandysNumber(){
        String candysString = "";
        String[] getCandys = new String [this.candys.length];
        byte[] count = new byte [this.candys.length + 1];
        TypeCandy[] sortedArr = this.bubbleSortByName(this.candys);
        int i;
        int j = 0;
        getCandys[j] = sortedArr[0].name;
        count[j] = 0;
        for (i=0; i<sortedArr.length; i++){
            if (sortedArr[i].name.equals(getCandys[j])){
                count[j]++;
            }else{
                getCandys[++j] = sortedArr[i].name;
                count[j] = 1;
            }
        }
        i = 0;
        while (count[i] != 0){
            candysString += getCandys[i] + " - " + count[i] + ". ";
            i++;
        }
        return candysString;
    }
    
    private TypeCandy[] bubbleSortByName(TypeCandy[] arr){///////////////// обобщенный в утилс???
        TypeCandy buffer;
        for (int i = arr.length - 1; i >= 0; i--){
            for (int j = 0; j < i; j++){
                if (arr[j].name.compareTo(arr[j + 1].name) > 0){
                    buffer = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buffer;
                }
            }
        }
        return arr;
    }
    
}
