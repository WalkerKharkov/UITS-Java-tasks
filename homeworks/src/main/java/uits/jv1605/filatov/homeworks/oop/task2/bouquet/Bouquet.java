/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.bouquet;

import java.text.DecimalFormat;


/**
 *
 * @author Alex
 * @param 
 */
public class Bouquet <TypeFlower extends Flower>{
    
    public String name;
    public int flowersNumber;
    
    private TypeFlower[] flowers;
    private Accessory accessory;
    
    public Bouquet(){}
    
    public Bouquet(TypeFlower[] flowers, Accessory accessory, String name){
        this.flowers = flowers;
        this.accessory = accessory;
        this.name = name;
        this.flowersNumber = this.flowers.length;
    }
    
    public String showBouquet(){
        String bouquet = "";
        bouquet += "Bouquet ";
        bouquet += ((this.flowers.length % 2) == 0) ? "for funeral " : "";
        bouquet += "\"" + this.name + "\"\n" + this.flowersNumber + " flowers :\n" + this.getNamesNumber() +
                   "\nAccessory : " + this.accessory.type + "\nPrice : " + this.getPrice() + "\n";
        return bouquet;
    }
    
    public void getSortByFreshness(TypeFlower[] arr){
        TypeFlower buffer;
        for (int i = arr.length - 1; i >= 0; i--){
            for (int j = 0; j < i; j++){
                if (arr[j].freshness > arr[j + 1].freshness){
                    buffer = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buffer;
                }
            }
        }
        System.out.println("Bouquet sorted by freshness :");
        System.out.println();
        for (TypeFlower flower: arr){
            System.out.println("Flower : " + flower.name + ", his freshness : " + flower.freshness);
        }
        System.out.println();
    }
    
    public void getSortByStemLength(TypeFlower[] arr){
        TypeFlower buffer;
        for (int i = arr.length - 1; i >= 0; i--){
            for (int j = 0; j < i; j++){
                if (arr[j].stemLength > arr[j + 1].stemLength){
                    buffer = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buffer;
                }
            }
        }
        System.out.println("Bouquet sorted by length of stem :");
        System.out.println();
        for (TypeFlower flower: arr){
            System.out.println("Flower : " + flower.name + ", his stem length : " + flower.stemLength);
        }
        System.out.println();
    }
    
    @Override
    public String toString(){
        return "";
    }
    
    private TypeFlower[] bubbleSortByName(TypeFlower[] arr){
        TypeFlower buffer;
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
    
    private String getNamesNumber(){
        String namesNumber = "";
        String[] names = new String [this.flowers.length];
        byte[] count = new byte [this.flowers.length + 1];
        TypeFlower[] sortedArr = this.bubbleSortByName(this.flowers);
        int i;
        int j = 0;
        names[j] = sortedArr[0].name;
        count[j] = 0;
        for (i=0; i<sortedArr.length; i++){
            if (sortedArr[i].name.equals(names[j])){
                count[j]++;
            }else{
                names[++j] = sortedArr[i].name;
                count[j] = 1;
            }
        }
        i = 0;
        while (count[i] != 0){
            namesNumber += names[i] + " - " + count[i] + ". ";
            i++;
        }
        return namesNumber;
    }
    
    private String getPrice(){
        float price = 0;
        for (TypeFlower flower: this.flowers){
            price += flower.price;
        }
        price += this.accessory.price;
        return (new DecimalFormat("#########.00")).format(price);
    }
    
}
