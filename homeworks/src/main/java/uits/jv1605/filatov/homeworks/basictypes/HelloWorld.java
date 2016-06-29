/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.basictypes;

/**
 *
 * @author Alex
 */
public class HelloWorld {
    
    public static void main(String[] args){
        
        // task 1. Hello, world
        
        System.out.println("Hello, World!");
        System.out.println();
        
        // task 2. some string
        
        String someText="This is just\n"+
                        "string, which\n"+
                        "does not matters";
        System.out.println(someText);
        System.out.println();
        
        // task 3. student
        
        String firstName="Filatov", lastName="Aleksey", fatherName="Anatolyevich",
               fullName, language="jv", groupNumber, firstDay="Monday", secondDay="Friday";
        int groupYear=16, groupMonth=5;
        float beginTime=19.00f, endTime=21.30f;
        
        fullName=firstName+" "+lastName+" "+fatherName;
        groupNumber=language+" "+groupYear+"-0"+groupMonth;
        
        System.out.println("Student : "+fullName);
        System.out.println("Group : "+groupNumber);
        System.out.println("Time of lessons : "+firstDay+", "+secondDay+" at "
                           +String.format("%.2f", beginTime).replace(',', '.')+
                           " - "+String.format("%.2f", endTime).replace(',', '.'));
        
    }            
    
}
