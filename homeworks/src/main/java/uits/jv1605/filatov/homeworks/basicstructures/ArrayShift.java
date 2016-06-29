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
public class ArrayShift {
    
    public static void main(String[] args) {
        
        int n, m, i, j;
        Scanner con = new Scanner(System.in);
        
        System.out.println("Введите количество столбцов массива :");
        m=con.nextInt();
        System.out.println("Введите количество строк массива :");
        n=con.nextInt();
        
        int [][] matrix = new int [n] [m];
        
        for (i=0; i<n; i++){
            for (j=0; j<m; j++){
                matrix[i][j]=(int)(Math.random()*100);
            }
        }
        
        matrixOut(matrix);
        universalShift(matrix);
    }
    
    public static void matrixOut(int [][] arr){
        int i, j;
        
        System.out.println("Матрица :");
        for (i=0; i<arr.length; i++){
            for (j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void universalShift(int [][] arr){
        int i, j, shift, stNumber, buffer;
        String shiftChoice, shiftDirection, repeat="y";
        Scanner con = new Scanner(System.in);
        boolean pause;
        
        while(repeat.equals("y")){
            repeat="";
            pause=true;
            System.out.println();
            System.out.println("Горизонтальный/вертикальный сдвиг? (h/v) :");
            shiftChoice=con.nextLine();
            System.out.println("Направление сдвига (вперед/назад)? (+/-) :");
            shiftDirection=con.nextLine();
            System.out.println("Номер строки/столбца, где будет производиться сдвиг? :");
            stNumber=con.nextInt();
            System.out.println("Количество элементов, на которые будет произведен сдвиг :");
            shift=con.nextInt();
            
            for (j=1; j<=shift; j++){
                switch(shiftChoice){
                    case "v":
                        if (shiftDirection.equals("+")){
                            buffer=arr[arr.length-1][stNumber];
                            for (i=arr.length-1; i>0; i--){
                                arr[i][stNumber]=arr[i-1][stNumber];
                            }
                            arr[0][stNumber]=buffer;
                        }else{
                            buffer=arr[0][stNumber];
                            for (i=1; i<arr.length; i++){
                                arr[i-1][stNumber]=arr[i][stNumber];
                            }
                            arr[arr.length-1][stNumber]=buffer;
                        }
                        break;
                    case "h": 
                        if (shiftDirection.equals("+")){
                            buffer=arr[stNumber][arr[stNumber].length-1];
                            for (i=arr[stNumber].length-1; i>0; i--){
                                arr[stNumber][i]=arr[stNumber][i-1];
                            }
                            arr[stNumber][0]=buffer;
                        }else{
                            buffer=arr[stNumber][0];
                            for (i=1; i<arr[stNumber].length; i++){
                                arr[stNumber][i-1]=arr[stNumber][i];
                            }
                            arr[stNumber][arr[stNumber].length-1]=buffer;
                        }
                }
            }
            
            matrixOut(arr);
            
            System.out.println("Еще один сдвиг? (y/n) :");
            /*знаю, ниже костыль, но иначе while не ждет подтверждения с консоли,
            а сразу завершается :)
            */
            while (pause){
                repeat=con.nextLine();
                if (!repeat.equals("")){
                    pause=!pause;
                }
            }    
        }    
    }
    
}
