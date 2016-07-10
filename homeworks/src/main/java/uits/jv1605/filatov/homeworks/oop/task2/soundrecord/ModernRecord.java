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
public class ModernRecord extends Record{
    
    private final String[] names = {"In Da Club", "Desert rose", "White roses", "Na Labutenah"};
    private final String[] groups = {"50 Cent", "Sting", "Laskovyi may", "Leningrad"};
    
    public ModernRecord(){
        super();
        int i = (int)(Math.random() * (this.names.length - 1));
        this.name = this.names[i];
        this.group = this.groups[i];
    }
    
    @Override
    public String toString(){
        return "Modern " + super.toString() + ", name : " + this.name + ", group : " + this.group;
    }
    
}
