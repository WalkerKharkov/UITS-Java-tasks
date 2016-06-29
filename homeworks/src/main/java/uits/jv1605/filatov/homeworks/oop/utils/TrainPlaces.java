/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.utils;

/**
 *
 * @author Alex
 */
public class TrainPlaces {
    
    public int general;
    public int coupe;
    public int platzkart;
    public int luxury;
            
    public TrainPlaces(int general, int coupe, int platzkart, int luxury){
        this.general = general;
        this.coupe = coupe;
        this.platzkart = platzkart;
        this.luxury = luxury;
    }  
    
    @Override
    public String toString(){
        return "places in train --> general: " + this.general + ", coupe: " +
               this.coupe + ", platzkart: " + this.platzkart + ", luxury: " +
               this.luxury; 
    }
    
}
