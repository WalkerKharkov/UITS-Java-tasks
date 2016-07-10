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
public class Record {
    
    public String name;
    public String group;
    public String style;
    public double length;
    
    private final String[] styles = {"classic", "pop", "rock", "jazz", "rap"};
    
    public Record(){
        this.style = this.styles[(int)(Math.random() * (this.styles.length - 1))];
        this.length = Math.random() * (10) + 1;
    }
    
    @Override
    public String toString(){
        return "record. Style : " + this.style + ", length : " + this.length;
    }
    
}
