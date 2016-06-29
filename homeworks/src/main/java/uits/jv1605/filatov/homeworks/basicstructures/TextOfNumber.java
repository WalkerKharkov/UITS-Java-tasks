/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.basicstructures;

/**
 *
 * @author Alex
 */
public class TextOfNumber {
    
    public static void main(String[] args) {
        
        int number;
        String textNumber="", buffer;
        char swap=' ';
        
        number=(int)(Math.random()*99);
        buffer=""+number;
        if(buffer.length()>1 && buffer.charAt(0)=='1'){
            switch (buffer.charAt(1)){
                case '0':
                    textNumber+="десять";
                    break;
                case '1':
                    textNumber+="одиннадцать";
                    break;
                case '2':
                    textNumber+="двенадцать";
                    break;
                case '3':
                    textNumber+="тринадцать";
                    break;
                case '4':
                    textNumber+="четырнадцать";
                    break;
                case '5':
                    textNumber+="пятнадцать";
                    break;
                case '6':
                    textNumber+="шестнадцать";
                    break;
                case '7':
                    textNumber+="семнадцать";
                    break;
                case '8':
                    textNumber+="восемнадцать";
                    break;
                case '9':
                    textNumber+="девятнадцать";
                    break;
            }
        } else {
            if(buffer.length()>1){
                switch(buffer.charAt(0)){
                    case '2':
                        textNumber+="двадцать ";
                        swap=buffer.charAt(1);
                        break;
                    case '3':
                        textNumber+="тридцать ";
                        swap=buffer.charAt(1);
                        break;
                    case '4':
                        textNumber+="сорок ";
                        swap=buffer.charAt(1);
                        break;
                    case '5':
                        textNumber+="пятьдесят ";
                        swap=buffer.charAt(1);
                        break;
                    case '6':
                        textNumber+="шестьдесят ";
                        swap=buffer.charAt(1);
                        break;
                    case '7':
                        textNumber+="семьдесят ";
                        swap=buffer.charAt(1);
                        break;
                    case '8':
                        textNumber+="восемьдесят ";
                        swap=buffer.charAt(1);
                        break;
                    case '9':
                        textNumber+="девяносто ";
                        swap=buffer.charAt(1);
                        break;    
                }
            } else {
                swap=buffer.charAt(0);
            }
            switch (swap){
                case '0':
                    if (buffer.length()==1){
                        textNumber="ноль";
                    }    
                    break;
                case '1':
                    textNumber+="один";
                    break;
                case '2':
                    textNumber+="два";
                    break;
                case '3':
                    textNumber+="три";
                    break;
                case '4':
                    textNumber+="четыре";
                    break;
                case '5':
                    textNumber+="пять";
                    break;
                case '6':
                    textNumber+="шесть";
                    break;
                case '7':
                    textNumber+="семь";
                    break;
                case '8':
                    textNumber+="восемь";
                    break;
                case '9':
                    textNumber+="девять";
                    break;    
            }
        }
        
        System.out.println("Выбрано число : "+number+". Его текстовое представление : "+textNumber);
        
    }
    
}
