/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.soundrecord;

/**
 *
 * @author Alex
 */
public class RetroRecord extends Record{
    
    private final String[] names = {"Yellow submarine", "Smoke on the water", "Lebedinoe ozero", 
                                    "Lunnaya sonata"};
    private final String[] groups = {"The Beatles", "Deep purple", "P.I. Tchaikovsky", "Bethoven"};
    
    public RetroRecord(){
        super();
        int i = (int)(Math.random() * (this.names.length - 1));
        this.name = this.names[i];
        this.group = this.groups[i];
    }
    
    @Override
    public String toString(){
        return "Retro " + super.toString() + ", name : " + this.name + ", group : " + this.group;
    }
    
}
