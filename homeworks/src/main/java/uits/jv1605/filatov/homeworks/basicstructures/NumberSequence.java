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
public class NumberSequence {
    
    public static void main(String[] args) {
        
        int i, multiple2=0, multiple7=0, residual;
        float ratio, multiple3=0, multiple5=0;
        
        for (i=0; i<=100; i++){
            if(i%2==0){
                System.out.println("Число "+i+" является кратным числу 2");
                multiple2+=i;
            }
            if(i%3==0){
                System.out.println("Число "+i+" является кратным числу 3");
                multiple3+=i;
            }
            if(i%5==0){
                System.out.println("Число "+i+" является кратным числу 5");
                multiple5+=i;
            }
            if(i%7==0){
                System.out.println("Число "+i+" является кратным числу 7");
                multiple7+=i;
            }
        }
        
        System.out.println();
        System.out.println("Сумма последовательности чисел, кратных 2 : "+multiple2);
        System.out.println("Сумма последовательности чисел, кратных 3 : "+String.format("%.0f", multiple3));
        System.out.println("Сумма последовательности чисел, кратных 5 : "+String.format("%.0f", multiple5));
        System.out.println("Сумма последовательности чисел, кратных 7 : "+multiple7);
        System.out.println();
        
        if(multiple7>multiple2){
            residual=multiple7-multiple2;
        } else {
            residual=multiple2-multiple7;
        }
        ratio=multiple5/multiple3;
        System.out.println("Разность сумм последовательности чисел, кратных 7 и чисел, кратных 2 : "+
                           residual);
        System.out.println("Отношение суммы последовательности чисел, кратных 5, к сумме"+
                           " последовательности чисел, кратных 3 : "+ratio);
        
    }
    
}
