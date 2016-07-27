/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.account;

import uits.jv1605.filatov.homeworks.oop.utils.GetCon;

/**
 *
 * @author Alex
 */
public class App {
    
    public static void main(String[] args) {
        
        AccountList accountList = new AccountList();
        
        accountListOperations(accountList);
    }
    
    public static void accountListOperations(AccountList acList){
        boolean repeatMode = true;
        char repeat;
        char mode;
        
        while (repeatMode) {
            mode = GetCon.getFirstChar("Enter mode of work : (s)ort / (g)et sum / (t)oggle block : ");
            switch(mode){
                case 's': {
                    acList.sortAccounts();
                    break;
                }
                case 'g': {
                    mode = GetCon.getFirstChar("Enter the kind of calculation : (t)otal / only (p)ositive " + 
                            "/ only (n)egative / without (b)locked : ");
                    switch (mode){
                        case 't':{
                            System.out.println("Total sum : $" + acList.getSum());
                            break;
                        }
                        case 'p':{
                            System.out.println("Total sum of positive balance accounts : $" + acList.getSum('+'));
                            break;
                        }
                        case 'n':{
                            System.out.println("Total sum of negative balance accounts : $-" + acList.getSum('-'));
                            break;
                        }
                        case 'b':{
                            System.out.println("Total sum of non-blocked accounts : $" + acList.getSum(true));
                            break;
                        }
                        default:{
                            System.out.println("Invalid mode!");
                        }
                    }
                    break;
                }
                case 't': {
                    long number = GetCon.getLong("Enter the number of account : ");
                    acList.blockToggle(acList.chooseAccount(number));
                    System.out.println("Done...");
                    break;
                }
                default:{
                    System.out.println("Invalid mode!");
                }
            }
            
            repeat = GetCon.getFirstChar("Do you want to work with your accounts more ( y / n ) : ");
            repeatMode = (repeat != 'n');    
        }
        
    }
    
}
