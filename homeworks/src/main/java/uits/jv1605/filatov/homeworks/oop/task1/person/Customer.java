/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task1.person;

/**
 *
 * @author Alex
 */
public class Customer extends Person{
    
    public long creditCardNumber;
    public long bankAccountNumber;
    public String encryptedCreditCardNumber;
    public String encryptedBankAccountNumber;
    
    Customer(int id, String name, String middleName, String lastName,
             String address, int phoneNumber, long creditCardNumber,
             long bankAccountNumber){
        super(id, name, middleName, lastName, address, phoneNumber);
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }
    
    Customer(int id, String name, String middleName, String lastName,
             String address, int phoneNumber){
        super(id, name, middleName, lastName, address, phoneNumber);
    }
    
    Customer(Person person){
        super(person);
    }
    
    Customer(Person person, long creditCardNumber, long bankAccountNumber){
             super(person);
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }
    
    public void setCustomerSettings(long creditCardNumber, long bankAccountNumber){
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.encryptCustomerSettings();
    }
        
    protected void encryptCustomerSettings(){
        String buffer;
        buffer = (creditCardNumber + "");
        this.encryptedCreditCardNumber = buffer.substring(0, 4) +
             "********" + buffer.substring(buffer.length() - 5, buffer.length() - 1);
        buffer = (bankAccountNumber + "");
        this.encryptedBankAccountNumber = buffer.substring(0, 3) +
             "******" + buffer.substring(buffer.length() - 4, buffer.length() - 1);        
    }
    
    public String getCustomerSettings(){
        return "Credit card number: " + this.encryptedCreditCardNumber + ", bank account number: " +
                this.encryptedBankAccountNumber;
    }
    
    @Override
    public String toString(){
        return "Customer: " + super.toString() + this.getCustomerSettings() + ".\n";
    }
    
}
