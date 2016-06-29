/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.utils;

import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class GetCon {
    
    public static Scanner con = new Scanner(System.in);
    public static String inputStream;
    
    
    public static String getString(String query){
        System.out.print(query);
        inputStream = con.nextLine();
        System.out.println();
        System.out.println();
        return inputStream;
    }
    
    public static byte getByte(String query){
        byte result; 
        try{
            result = Byte.valueOf(getString(query));
        }catch(IllegalArgumentException e){
            System.err.println("Invalid argument!");
            result = 0;
        }
        return result;
    }
    
    public static short getShort(String query){
        short result; 
        try{
            result = Short.valueOf(getString(query));
        }catch (IllegalArgumentException e){
            System.err.println("Invalid argument!");
            result = 0;
        }
        return result;
    }
    
    public static long getLong(String query){
        long result; 
        try{
            result = Long.valueOf(getString(query));
        }catch (IllegalArgumentException e){
            System.err.println("Invalid argument!");
            result = 0;
        }
        return result;
    }
    
    public static int getInteger(String query){
        int result; 
        try{
            result = Integer.valueOf(getString(query));
        }catch (IllegalArgumentException e){
            System.err.println("Invalid argument!");
            result = 0;
        }
        return result;
    }
    
    public static float getFloat(String query){
        float result; 
        try{
            result = Float.valueOf(getString(query));
        }catch (IllegalArgumentException e){
            System.err.println("Invalid argument!");
            result = 0;
        }
        return result;
    }
    
    public static char getFirstChar(String query){
        char result;
        try{
            result = getString(query).charAt(0);
        }catch (IllegalArgumentException e){
            System.err.println("Invalid argument!");
            result = 0;
        }
        return result;
    }
    
}
