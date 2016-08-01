/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.kitchen.interfaces;

import uits.jv1605.filatov.homeworks.oop.kitchen.classes.Plant;
/**
 *
 * @author Alex
 */
public interface Peeller {
    
    public double peellItem(Plant plant);
    public double peellItems(Plant[] plants);
    
}
