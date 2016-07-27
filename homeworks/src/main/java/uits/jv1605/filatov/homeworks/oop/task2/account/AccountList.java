/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.account;

import java.text.DecimalFormat;
import uits.jv1605.filatov.homeworks.oop.utils.GetCon;
import java.util.*;
/**
 *
 * @author Alex
 */
public class AccountList {
    
    public int accountsNumber;
    public Account[] accountsList;
    
    private final DecimalFormat f = new DecimalFormat("#0.00");
    
    public AccountList(){
        int num = GetCon.getInteger("Enter the number of accounts : ");
        this.accountsList = new Account[num];
        for (int i = 0; i < num; i++){
            this.accountsList[i] = new Account();
        }
        System.out.println("Your account list :");
        this.showList();
    }
    
    public void showList(){
        for (int i = 0; i < this.accountsList.length; i++){
            System.out.println(this.accountsList[i]);
        }
        System.out.println("");
    }
    
    public String getSum(){
        double sum = 0;
        for (int i = 0; i < this.accountsList.length; i++){
            sum += this.accountsList[i].balance;
        }
        return f.format(sum);
    }
    
    public String getSum(char mode){
        double sum = 0;
        for (int i = 0; i < this.accountsList.length; i++){
            switch (mode){
                case '+': {
                    sum += (this.accountsList[i].balance >= 0) ? this.accountsList[i].balance : 0;
                    break;
                }
                case '-': {
                    sum -= (this.accountsList[i].balance < 0) ? this.accountsList[i].balance : 0;
                    break;
                }
                default: {
                    return "Invalid mode!";
                }
            }
        }
        return f.format(sum);
    }
    
    public String getSum(boolean withoutBlocked){
        double sum = 0;
        for (int i = 0; i < this.accountsList.length; i++){
            sum += (this.accountsList[i].blocked) ? 0 : this.accountsList[i].balance;
        }
        return f.format(sum);
    }
    
    public Account chooseAccount(long number){
        for (int i = 0; i < this.accountsList.length; i++){
            if (this.accountsList[i].number == number){
                return this.accountsList[i];
            }
        }
        return this.accountsList[0];
    }
    
    public void blockToggle(Account account){
        account.blocked = ! account.blocked;
    }
    
    public void sortAccounts(){
        char mode = GetCon.getFirstChar("Enter the field for sort : (n)umber / (b)alance / ");
        AccountList.AccountComparator comp = new AccountList.AccountComparator();
        switch(mode){
            case 'n':{
                comp.field = AccountList.AccountComparator.SortingField.number;
                break;
            }
            case 'b':{
                comp.field = AccountList.AccountComparator.SortingField.balance;
                break;
            }
            default:{
                System.out.println("Invalid argument!");
            }
        }
        Arrays.sort(this.accountsList, comp);
        System.out.println("Accounts, sorted by " + comp.field + " :");
        System.out.println();
        this.showList();
    }
    
    private static class AccountComparator implements Comparator <Account>{
        
        enum SortingField {number, balance};
        SortingField field = SortingField.number;
        
        @Override
        public int compare(Account first, Account second){
            double result;
            switch (field){
                case number:{
                    result = first.number - second.number;
                    if (result > 0){
                        return 1;
                    } else if (result < 0){
                        return -1;
                    } else {
                        return 0;
                    }
                }
                case balance:{
                    result = first.balance - second.balance;
                    if (result > 0){
                        return 1;
                    } else if (result < 0){
                        return -1;
                    } else {
                        return 0;
                    }
                }
                default:{
                    throw new IllegalArgumentException();
                }
            }
        }
        
    }
            
}
