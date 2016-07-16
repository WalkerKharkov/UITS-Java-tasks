/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.transport.taxi;

import uits.jv1605.filatov.homeworks.oop.task2.transport.Fuel;

/**
 *
 * @author Alex
 */
public class Car extends Fuel{
    
    public int price;
    public int speed;
    
    public Car(){
        this.fuelType = (Math.random() * 1 > .5) ? FuelTypes.diesel : FuelTypes.gas;
    }
    
}
