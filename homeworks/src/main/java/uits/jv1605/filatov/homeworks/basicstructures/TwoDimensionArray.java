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
public class TwoDimensionArray {
    
    public static void main(String[] args) {
        
        Scanner con = new Scanner(System.in);
        int n, m, i, j;
        
        System.out.println("Введите количество столбцов массива :");
        m=con.nextInt();
        System.out.println("Введите количество строк массива :");
        n=con.nextInt();
        
        int [][] twoDimArray = new int [n] [m];
        
        for (i=0; i<n; i++){
            for (j=0; j<m; j++){
                twoDimArray[i][j]=(int)(Math.random()*100);
            }
        }
        
        directOut(twoDimArray);
        System.out.println();
        reverseOut(twoDimArray);
        System.out.println();
        evenRowEvenElementsOut(twoDimArray);
        System.out.println();
        notEvenColumnNotEvenElementsOut(twoDimArray);
        System.out.println();
        sumMultiple7ElemsEvenStrings(twoDimArray);
        System.out.println();
        productMultiple3ElementsNotEvenStrings(twoDimArray);
        
    }
    
    public static void directOut(int [][] arr){
        int i, j;
        System.out.println("Прямой вывод матрицы :");
        for (i=0; i<arr.length; i++){
            for (j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void reverseOut(int [][] arr){
        int i, j;
        System.out.println("Обратный вывод матрицы :");
        for (i=arr.length-1; i>=0; i--){
            for (j=arr[0].length-1; j>=0; j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void evenRowEvenElementsOut(int [][] arr){
        int i, j;
        System.out.println("Четные элементы в четных строках :");
        for (i=0; i<arr.length; i++){
            if (i%2==0){
                System.out.println("Строка "+i);
                for (j=0; j<arr[0].length; j++){
                    if (arr[i][j]%2==0){
                        System.out.print(arr[i][j]+" ");
                    }    
                }
                System.out.println();
            }
        }
    }
    
    public static void notEvenColumnNotEvenElementsOut(int [][] arr){
        int i, j;
        System.out.println("Нечетные элементы в нечетных столбцах :");
        for (j=0; j<arr[0].length; j++){
            if (j%2!=0){
                System.out.println("Столбец "+j);
                for (i=0; i<arr.length; i++){
                    if (arr[i][j]%2!=0){
                        System.out.print(arr[i][j]+" ");
                    }
                }
                System.out.println();
            }    
        }
    }
    
    public static void sumMultiple7ElemsEvenStrings(int [][] arr){
        int i, j, sum=0;
        for (i=0; i<arr.length; i++){
            if (i%2==0){
                for (j=0; j<arr[0].length; j++){
                    if (arr[i][j]%7==0){
                        sum+=arr[i][j];
                    }
                }
            }    
        }
        System.out.println("Сумма всех элементов, кратных 7, в четных строках : "+sum);
    }
    
    public static void productMultiple3ElementsNotEvenStrings(int [][] arr){
        int i, j, product=1;
        for (i=0; i<arr.length; i++){
            if (i%2!=0){
                for (j=0; j<arr[0].length; j++){
                    if (arr[i][j]%3==0 && arr [i][j]!=0){
                        product*=arr[i][j];
                    }
                }
            }    
        }
        System.out.println("Произведение всех элементов, кратных 3, в нечетных строках : "+product);
    }
    
}
