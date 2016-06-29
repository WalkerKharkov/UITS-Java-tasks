/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task1.person;

import uits.jv1605.filatov.homeworks.oop.utils.Filter;
/**
 *
 * @author Alex
 */
public class Patient extends Person{
    
    public int medicalCardNumber;
    protected String diagnosis;
    
    
    Patient(int id, String name, String middleName, String lastName,
            String address, int phoneNumber, int medicalCardNumber,
            String diagnosis){
        super(id, name, middleName, lastName, address, phoneNumber);
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }
    
    Patient(int id, String name, String middleName, String lastName,
            String address, int phoneNumber){
        super(id, name, middleName, lastName, address, phoneNumber);
    }
    
    Patient(Person person){
        super(person);
    }
    
    public void setMedicalCardNumber(int medicalCardNumber){
        this.medicalCardNumber = medicalCardNumber;
    }
    
    public void setDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }
    
    public int getMedicalCardNumber(){
        return this.medicalCardNumber;
    }
    
    public String getDiagnosis(){
        return (this.diagnosis.equals("")) ? "There is no diagnosis for this patient yet!\n" :
            "Sorry, diagnosis is strictly classified, according to current legislation!\n";
        }
    
    @Override
    public String toString(){
        return "Patient: " + super.toString() + "medical card number: " +
                this.medicalCardNumber + ".\n" + this.getDiagnosis() + ".\n";
    }
    
    public void filterApply(Filter filter){
        switch (filter.mode){
            case 'd':
                if (this.diagnosis.equals(filter.diagnosis)){
                    System.out.println(this.toString());
                }
                break;
        }
    }
    
}
