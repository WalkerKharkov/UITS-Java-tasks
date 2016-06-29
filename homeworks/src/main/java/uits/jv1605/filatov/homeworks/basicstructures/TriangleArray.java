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
public class TriangleArray {
    
    public static void main(String[] args) {
        
        Scanner con = new Scanner(System.in);
        int n, i, j;
        
        System.out.println("Введите количество строк в массиве :");
        n=con.nextInt();
        System.out.println();
                
        
        int [][] triangleArray = new int [n][];
        
        for (i=0; i<n; i++){
            triangleArray[i] = new int [i+1];
            for (j=0; j<=i; j++){
                triangleArray[i][j]=(int)(Math.random()*100);
            }
        }
        
        directOut(triangleArray);
        System.out.println();
        horizontalInverseOut(triangleArray);
        System.out.println();
        verticalInverseOut(triangleArray);
        System.out.println();
        horizontalVerticalInverseOut(triangleArray);
        
    }
    
    public static void directOut(int [][] arr){
        int i, j;
        
        for (i=0; i<arr.length; i++){
            for (j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void horizontalInverseOut (int [][] arr){
        int i, j;
        
        System.out.println("Вывод массива в горизонтальном отражении");
        for (i=arr.length-1; i>=0; i--){
            for (j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void verticalInverseOut (int [][] arr){
        int i, j, k;
        String tab="";
        
        System.out.println("Вывод массива в вертикальном отражении");
        for (i=0; i<arr.length; i++){
            for (k=0; k<(arr.length-arr[i].length)*3; k++){
                    tab+=" ";
            }
            System.out.print(tab);
            tab="";
            for (j=arr[i].length-1; j>=0; j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void horizontalVerticalInverseOut(int [][] arr){
        int i, j, k;
        String tab="";
        
        System.out.println("Вывод массива в горизонтальном и вертикальном отражении");
        for (i=arr.length-1; i>=0; i--){
            for (k=0; k<(arr.length-arr[i].length)*3; k++){
                    tab+=" ";
            }
            System.out.print(tab);
            tab="";
            for (j=arr[i].length-1; j>=0; j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
  
}
