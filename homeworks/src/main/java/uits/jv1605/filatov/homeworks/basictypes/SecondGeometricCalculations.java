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
public class SecondGeometricCalculations {
    
    public static void main(String[] args) {
        
        Scanner con = new Scanner(System.in);
        
        // task 1. barrel
        
        float pi=3.14f, maxRadius, minRadius, height;
        
        System.out.println("Enter the barrel outer radius :");
        maxRadius=con.nextFloat();
        System.out.println("Enter the barrel inner radius :");
        minRadius=con.nextFloat();
        System.out.println("Enter the barrel height :");
        height=con.nextFloat();
        System.out.println("This barrel volume : "+barrelVolume(pi, maxRadius, height));
        System.out.println("This empty barrel volume : "+emptyBarrelVolume(pi, maxRadius, minRadius, height));
        System.out.println("This barrel side area : "+barrelSideArea(pi, maxRadius, height));
        System.out.println();
        
        // task 2. ball
        
        System.out.println("Enter the ball radius :");
        maxRadius=con.nextFloat();
        System.out.println("This ball volume : "+ballVolume(pi, maxRadius));
        System.out.println("This ball area : "+ballArea(pi, maxRadius));
        System.out.println();
        
        // task 3. parallelepiped
        
        float a, b, c;
        
        System.out.println("Enter the first side of parallelepiped :");
        a=con.nextFloat();
        System.out.println("Enter the second side of parallelepiped :");
        b=con.nextFloat();
        System.out.println("Enter the third side of parallelepiped :");
        c=con.nextFloat();
        System.out.println("This parallelepiped volume : "+parallelepipedVolume(a, b, c));
        System.out.println("This parallelepiped area : "+parallelepipedArea(a, b, c));
        System.out.println();
        
        // task 4. tetrahedron
        
        System.out.println("Enter the tetrahedron side :");
        a=con.nextFloat();
        System.out.println("This tetrahedron volume : "+tetrahedronVolume(a));
        System.out.println("This tetrahedron area : "+tetrahedronArea(a));
        
    }
    
    // task 1 methods
    
    public static float barrelVolume(float pi, float radius, float height){
        return pi*radius*radius*height;
    }
    
    public static float emptyBarrelVolume(float pi, float maxRadius, float minRadius, float height){
        return pi*height*(maxRadius*maxRadius-minRadius*minRadius);
    }
    
    public static float barrelSideArea(float pi, float radius, float height){
        return 2*pi*radius*height;
    }
    
    // task 2 methods
    
    public static float ballVolume(float pi, float radius){
        return 4*pi*radius*radius*radius/3;
    }
    
    public static float ballArea(float pi, float radius){
        return 4*pi*radius*radius;
    }
    
    // task 3 methods
    
    public static float parallelepipedVolume(float a, float b, float c){
        return a*b*c;
    }
    
    public static float parallelepipedArea(float a, float b, float c){
        return 2*(a*b+a*c+b*c);
    }
    
    // task 4 methods
    
    public static double tetrahedronVolume(float a){
        return (Math.sqrt(2)/12)*a*a*a;
    }
    
    public static double tetrahedronArea(float a){
        return Math.sqrt(3)*a*a;
    }
    
}
