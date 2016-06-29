/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task1.person;

import uits.jv1605.filatov.homeworks.oop.utils.*;
/**
 *
 * @author Alex
 */
public class Student extends Person{
    
    public SimpleDate birthday;
    public String faculty;
    public byte course;
    public byte group;
    
    Student(int id, String name, String middleName, String lastName,
            String address, int phoneNumber, SimpleDate birthday, String faculty,
            byte course, byte group){
        super(id, name, middleName, lastName, address, phoneNumber);
        this.birthday = birthday;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    
    Student(int id, String name, String middleName, String lastName,
            String address, int phoneNumber){
        super(id, name, middleName, lastName, address, phoneNumber);
    }
    
    Student(Person person){
        super(person);
    }
    
    public void setEducationSettings(String faculty, byte course, byte group){
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    
    public String getEducationSettings(){
        return "Faculty: " + this.faculty + ", course: " + this.course +
               ", group: " + this.group;
    }
    
    public void setBirthday(SimpleDate birthday){
        this.birthday = birthday;
    }
    
    public String getBirthday(){
        return this.birthday.day + "." + this.birthday.month + "." + this.birthday.year;
    }
    
    @Override
    public String toString(){
        return "Student: " + super.toString() + "birthday: " + this.getBirthday() + ", \n" +
               this.getEducationSettings() + ".\n";
    }
    
    public void filterApply(Filter filter){
        switch (filter.mode){
            case 'f':
                if (this.faculty.equals(filter.faculty)){
                    System.out.println(this.toString());
                }
                break;
            case 'c':
                if ((this.faculty.equals(filter.faculty)) && (this.course == filter.course)){
                    System.out.println(this.toString());
                }    
                break;
            case 'y':
                if (this.birthday.year > filter.year){
                    System.out.println(this.toString());
                }
                break;
            case 'g':
                if ((this.faculty.equals(filter.faculty)) && (this.group==filter.group)){ 
                    System.out.println(this.toString());
                }    
                break;
        }
    }
    
}
