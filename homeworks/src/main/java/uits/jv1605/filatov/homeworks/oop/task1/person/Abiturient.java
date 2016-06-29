/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task1.person;


import uits.jv1605.filatov.homeworks.oop.utils.Marks;
import uits.jv1605.filatov.homeworks.oop.utils.Filter;
import java.util.regex.Pattern;

/**
 *
 * @author Alex
 */
public class Abiturient extends Person{
    
    public Marks marks;
    public short sum;
    
    Abiturient(int id, String name, String middleName, String lastName,
               String address, int phoneNumber, Marks marks){
        super(id, name, middleName, lastName, address, phoneNumber);
        this.marks = marks;
    }
    
    Abiturient(int id, String name, String middleName, String lastName,
               String address, int phoneNumber){
        super(id, name, middleName, lastName, address, phoneNumber);
    }
    
    Abiturient(Person person){
        super(person);
    }
    
    public void setMarks(byte algebra, byte geometry, byte history,
                         byte geography, byte english){
        this.marks = new Marks(algebra, geometry, history, geography, english);
        this.sum = marksSum(this);
    }
    
    public String getMarks(){
        return "Algebra: " + this.marks.algebra + ", " +
               "geometry: " + this.marks.geometry + ", " +
               "history: " + this.marks.history + ", " +
               "geography: " + this.marks.geography + ", " +
               "english: " + this.marks.english; 
    }
    
    @Override
    public String toString(){
        return "Abiturient: " + super.toString() +
               "marks: \n" + this.getMarks() + ".\n";
    }
    
    public void filterApply(Filter filter){
        switch (filter.mode){
            case 'f':
                if ((this.getMarks().contains("1")) || (this.getMarks().contains("2"))){
                    System.out.println(this.toString());
                }    
                break;
            case 'b':
                if (this.sum > filter.sum){
                    System.out.println(this.toString());
                }    
                break;
            case 'h':
                if (this.sum >= filter.passingSum / 2){
                    System.out.println(this.toString());
                }    
                break;
        }
    }
    
    private static short marksSum(Abiturient abiturient){
        short sum = 0;
        Pattern pattern = Pattern.compile("\\D+");
        String [] marks = pattern.split(abiturient.getMarks());
        for (int i = 1; i < marks.length; i++){
            sum += Short.valueOf(marks[i]);
        }
        return sum;
    }

}
