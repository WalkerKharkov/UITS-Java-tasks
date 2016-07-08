/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.appliances;

/**
 *
 * @author Alex
 */
public class Entertainment extends Appliance{
    
    public String appointment;
    
    private final static String[] names = {"cd-player", "tv", "desktop", "ipad", "xbox"};
    
    public Entertainment(){
        super();
        this.name = this.names[(int)(Math.random() * (this.names.length - 1))];
        int rand = (int)(Math.random() * 2) + 1;
        switch (rand){
            case (1):{
                this.appointment = "musical";
                break;
            }
            case (2):{
                this.appointment = "video";
                break;
            }
        }
    }
    
    @Override
    public String toString(){
        return "Entertainment" + super.toString();
    }
    
}
