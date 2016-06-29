/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task1.thing;

import uits.jv1605.filatov.homeworks.oop.utils.Filter;

/**
 *
 * @author Alex
 */
public class Book extends Thing{
    
    public String name;
    public String authors;
    public String publishing;
    public short publishingYear;
    public short pages;
    public String cover;
    
    public Book(Thing thing){
        super(thing);
    }
    
    public Book(Thing thing, String name, String authors, String publishing,
                short publishingYear, short pages, String cover){
        super(thing);
        this.name = name;
        this.authors = authors;
        this.publishing = publishing;
        this.publishingYear = publishingYear;
        this.pages = pages;
        this.cover = cover;
    }
    
    public Book(int id, float price, String name, String authors, String publishing,
                short publishingYear, short pages, String cover){
        this.id = id;
        this.price = price;
        this.name = name;
        this.authors = authors;
        this.publishing = publishing;
        this.publishingYear = publishingYear;
        this.pages = pages;
        this.cover = cover;
    }
    
    public void setBookSettings(String name, String authors, String publishing,
                                short publishingYear, short pages, String cover){
        this.name = name;
        this.authors = authors;
        this.publishing = publishing;
        this.publishingYear = publishingYear;
        this.pages = pages;
        this.cover = cover;
    }
    
    @Override
    public String toString(){
        return "Book : \nname : " +this.name + "\nauthor(s) : " + this.authors + "\n" +
               super.toString() + "publishing : " + this.publishing + ", publishing year : " +
               this.publishingYear + "\npages : " + this.pages + "\ncover type : " +
               this.cover + "\n";
    }
    
    public void filterApply(Filter filter){
        switch (filter.mode){
            case 'a':
                if (this.authors.equals(filter.authors)){
                    System.out.println(this.toString());
                }    
                break;
            case 'p':
                if (this.publishing.equals(filter.publishing)){
                    System.out.println(this.toString());
                }    
                break;
            case 'y':
                if (this.publishingYear > filter.publishingYear){
                    System.out.println(this.toString());
                }    
                break;    
        }
    }
    
}
