/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.mindbreaker;

import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class MindBreaker {
    
    public static void main(String[] args) {
        
        byte day, month;
        short year;
        int date;
        Scanner con = new Scanner(System.in);
        
        System.out.println("Введите день :");
        day=con.nextByte();
        System.out.println("Введите месяц :");
        month=con.nextByte();
        System.out.println("Введите год :");
        year=con.nextShort();
        System.out.println();
        
        encode(day, month, year);
        
        System.out.println("Введите число с зашифрованной в нем датой :");
        date=con.nextInt();
        
        decode(date);
        
    }
    
    public static void encode(byte day, byte month, short year){
        
        int date=0;
        
        date+=day;
        date=date<<8;
        date+=month;
        date=date<<16;
        date+=year;
        
        System.out.println("Результат шифрования полученной даты : "+date);
        System.out.println();
        
    }
    
    public static void decode(int date){
     
        byte day, month;
        short year;
        boolean valid=false;
        
        year=(short)date;
        date=date>>16;
        month=(byte)date;
        date=date>>8;
        day=(byte)date;
        
        if((day>=1&&day<=31)&&(month>=1&&month<=12)&&year>0){
            switch(month){
                case 2:
                    boolean leapYear=false;
                    if (year%4==0){
                        leapYear=true;
                    }
                    if (year%100==0&&year%400!=0){
                        leapYear=false;
                    }
                    if (day<=28||(day==29&&leapYear)){
                        valid=true;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day<=30){
                        valid=true;
                    }
                    break;
                default:
                    valid=true;
            }
        }
        
        if (valid){
            System.out.println("Расшифрованная дата : "+day+"."+month+"."+year);
        }else{
            System.out.println("Число не является зашифрованной датой!");
        }
        
    }
    
}
