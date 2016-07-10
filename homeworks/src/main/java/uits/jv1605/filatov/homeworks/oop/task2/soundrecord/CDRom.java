/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.soundrecord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import uits.jv1605.filatov.homeworks.oop.utils.GetCon;
import uits.jv1605.filatov.homeworks.oop.utils.MainUtils;

/**
 *
 * @author Alex
 */
public class CDRom <TypeRecord extends Record>{
    
    public ArrayList <Record> cd = new ArrayList <Record>(); 
    public double totalLength = 0;
    public String records = "";
    
    public CDRom(int length){
        double rand;
        Record record;
        System.out.println("Our CD-Rom contains : ");
        System.out.println();
        for (int i=0; i<length; i++){
            rand = Math.random() * 1;
            record = (rand < .5) ? new RetroRecord() : new ModernRecord();
            this.totalLength += record.length;
            this.cd.add(record);
            System.out.println("№ " + (i + 1) + " : " + record);
        }
        getRecords();
    }
    
    public void sortByStyle(){
        System.out.println("Sort by style : ");
        CDRom.CDComparator comp = new CDRom.CDComparator();
        Collections.sort(this.cd, comp);
        System.out.println();
        for (Record rec: this.cd){
            System.out.println(rec);
        }
        System.out.println();
    }
    
    public void searchByLength(){
        System.out.println("Search by length");
        double minVal = GetCon.getDouble("Enter minimal value : ");
        double maxVal = GetCon.getDouble("Enter maximal value : ");
        for (Record rec: this.cd){
            if ((rec.length >= minVal) && (rec.length <= maxVal)){
                System.out.println(rec);
            }    
        }
    }
    
    public void getRecords(){
        for (Record rec: cd){
            this.records += rec.name + " " + rec.group + " " + rec.style + " " + rec.length + "\n";
        }
    }
    
    @Override
    public String toString(){
        return "\nThis cd contains : \n" + this.records +
               "Total length : " + this.totalLength + "\n";
    }
    
    public static class CDComparator implements Comparator <Record>{
        @Override
        public int compare(Record rec1, Record rec2){
                return(rec1.style.compareTo(rec2.style));
        }
    }
    
}
