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
public class SimpleDate {
    
    public byte day;
    public byte month;
    public short year;
    
    public SimpleDate(byte day, byte month, short year){
        this.day = ((day < 1) || (day > 31)) ? 1 : day;
        this.month = ((month < 1) || (month > 12)) ? 1 : month;
        this.year = ( year < 0 ) ? 1970 : year;
        switch(this.month){
            case 2:
                boolean leapYear = ((this.year % 4 == 0) && (this.year % 100 != 0))||(this.year % 400 == 0);
                this.day = ((this.day <= 28) || ((this.day == 29) && leapYear)) ? this.day : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                this.day = (this.day <= 30) ? this.day : 30;
            }
    }
    
}
