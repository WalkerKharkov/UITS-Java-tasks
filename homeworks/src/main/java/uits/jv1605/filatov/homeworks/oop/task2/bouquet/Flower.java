/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.bouquet;

/**
 *
 * @author Alex
 */
public class Flower {
    
    public short stemLength;
    public byte freshness;
    public float price;
    public String name;
    
    private static float maxStemLength = 50.0f;
    private static byte minFreshness = 3;
    private static float maxPrice = 50.00f;
    
    public Flower(){
        this.stemLength = (short)(Math.random() * (maxStemLength - 19) + 20);
        this.freshness = (byte)(Math.random() * (minFreshness) + 1);
        this.price = (float)(Math.random() * (maxPrice - 9) + 10);
    }
    
    public Flower(short stemLength, byte freshness, float price, String name){
        this.stemLength = stemLength;
        this.freshness = freshness;
        this.price = price;
        this.name = name;
    }
    
    public void setSeason(String s){}
    public void setLocation(String s){}
    public void setCountry(String s){}
    
}
