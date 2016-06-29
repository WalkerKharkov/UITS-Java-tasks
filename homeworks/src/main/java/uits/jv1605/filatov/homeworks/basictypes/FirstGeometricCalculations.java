/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.basictypes;

import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class FirstGeometricCalculations {
         
    public static void main(String[] args) {
        
        Scanner con = new Scanner(System.in);
        
        /*
        
        Проблемное место кода, проверка введенного значения на соответствие типу.
        Значение в переменной сохраняется только в рамках конструкции if:
        
        float maxRadius;
        
        System.out.println("Enter the outer circle radius :");
        if (con.hasNextFloat()){
            maxRadius=con.nextFloat();
            System.out.println(maxRadius); // здесь значение в переменной есть
        } else {
            System.out.println("It's not valid argument!");
        }
        System.out.println(maxRadius); // здесь переменная уже не инициализирована
        */
        
        // task 1. circle and ring
        
        float pi=3.14f, minRadius, maxRadius;
        
        System.out.println("Enter the outer circle radius :");
        maxRadius=con.nextFloat();
        System.out.println("Enter the inner circle radius :");
        minRadius=con.nextFloat();
        System.out.println("Length of this circle : "+circleLength(pi, maxRadius));
        System.out.println("Area of this circle : "+circleArea(pi, maxRadius));
        System.out.println("Area of this ring : "+ringArea(pi, minRadius, maxRadius));
        System.out.println();
                
        // task 2. triangle
        
        float a, b, c;
        
        System.out.println("Enter the first side of triangle :");
        a=con.nextFloat();
        System.out.println("Enter the second side of triangle :");
        b=con.nextFloat();
        System.out.println("Enter the third side of triangle :");
        c=con.nextFloat();
        System.out.println("Perimeter of this triangle : "+trianglePerimeter(a, b, c));
        System.out.println("Area of this triangle : "+triangleArea(a, b, c));
        System.out.println();
        
        //task 3. rectangle
        
        System.out.println("Enter the first side of rectangle :");
        a=con.nextFloat();
        System.out.println("Enter the second side of rectangle :");
        b=con.nextFloat();
        System.out.println("Perimeter of this rectangle : "+rectanglePerimeter(a, b));
        System.out.println("Area of this rectangle : "+rectangleArea(a, b));
                
    }
    
    
    //task 1 methods
    
    public static float circleLength(float pi, float radius){
        return 2*pi*radius;
    }
    
    public static float circleArea(float pi, float radius){
        return pi*radius*radius;
    }
    
    public static float ringArea(float pi, float minRadius, float maxRadius){
        return pi*(maxRadius*maxRadius-minRadius*minRadius);
    }
    
    //task 2 methods
    
    public static float trianglePerimeter(float a, float b, float c){
        return a+b+c;
    }
    
    public static double triangleArea(float a, float b, float c){
        float p;
        p=trianglePerimeter(a, b, c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
    // task 3 methods
    
    public static float rectanglePerimeter(float a, float b){
        return a*2+b*2;
    }
    
    public static float rectangleArea(float a, float b){
        return a*b;
    }
    
}
