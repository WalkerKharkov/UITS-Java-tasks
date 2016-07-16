/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.transport;

/**
 *
 * @author Alex
 */
public abstract class Fuel extends Transport{
    
    public static enum FuelTypes {gas, kerosene, diesel};
    
    public FuelTypes fuelType;
    
}
