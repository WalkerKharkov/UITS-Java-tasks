/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.basicstructures;

import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class OneDimensionArray {
    
    public static void main(String[] args) {
        
        Scanner con = new Scanner(System.in);
        int n;
        
        System.out.println("Введите количество элементов в массиве :");
        n=con.nextInt();
        
        int[] oneDimArray = new int[n];
        int i;
        
        for (i=0; i<n; i++){
            oneDimArray[i]=(int)(Math.random()*100);
        }
        
        directOut(oneDimArray);
        System.out.println();
        reverseOut(oneDimArray);
        System.out.println();
        evenOut(oneDimArray);
        System.out.println();
        notEvenOut(oneDimArray);
        System.out.println();
        sumOfMultiple7Out(oneDimArray);
        System.out.println();
        productOfMultiple3Out(oneDimArray);
        
    }
    
    /*при желании и необходимости можно реализовать один метод для вывода,
      принимающий дополнительный аргумент в качестве флага "прямой/обратный"
    */
    
    public static void directOut(int [] arr){
        int i;
        for (i=0; i<arr.length; i++){
            System.out.println("Элемент массива под номером "+i+" --> "+arr[i]);
        }
    }
    
    public static void reverseOut(int [] arr){
        int i;
        for (i=arr.length-1; i>=0; i--){
            System.out.println("Элемент массива под номером "+i+" --> "+arr[i]);
        }
    }
    
    //точно так же и с этими методами :)
    
    public static void evenOut(int [] arr){
        int i;
        for (i=0; i<arr.length; i++){
            if (arr[i]%2!=0){
                continue;
            }
            System.out.println("Четный элемент массива под номером "+i+" --> "+arr[i]);
        }
    }
    
    public static void notEvenOut(int [] arr){
        int i;
        for (i=0; i<arr.length; i++){
            if (arr[i]%2==0){
                continue;
            }
            System.out.println("Нечетный элемент массива под номером "+i+" --> "+arr[i]);
        }
    }
    
    public static void sumOfMultiple7Out(int [] arr){
        int i, sum=0;
        for (i=0; i<arr.length; i++){
            if (arr[i]%7==0){
                sum+=arr[i];
            }
        }
        System.out.println("Сумма элементов массива, кратных 7 : "+sum);
    }
    
    public static void productOfMultiple3Out(int [] arr){
        int i, product=1;
        for (i=0; i<arr.length; i++){
            if (arr[i]%3==0 && arr[i]!=0){
                product*=arr[i];
            }
        }
        System.out.println("Произведение элементов массива, кратных 3 : "+product);
    }
    
}
