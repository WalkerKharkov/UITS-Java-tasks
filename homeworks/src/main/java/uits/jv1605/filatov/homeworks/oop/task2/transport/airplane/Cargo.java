/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.transport.airplane;

/**
 *
 * @author Alex
 */
public class Cargo extends Airplane{
    
    
    private final int[] payloads = {80, 120};
    private final String[] models = {"Boeing-747-400", "AN-124-RUSLAN", "AN-225"};
    
    public Cargo(){
        super();
        this.payload = (int)(Math.random() * (this.payloads[1] - this.payloads[0]) +
                this.payloads[0]);
        this.model = this.models[(int)(Math.random() * (this.models.length - 1))];
    }
    
    @Override
    public String toString(){
        return "Cargo " + super.toString();
    }
    
}
