/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testassignment04;

/**
 *
 * @author sarke
 */
public class Account {
    
     private double balance;
    private Customer customer;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public void deposit(int amount){
        if(amount<0){
            System.out.print("Invalid deposit amount");
        }
        else{
            balance =balance + amount;
        }
        
       }
     public Account(){
            this.balance=0;
     }
            
    
     public Account(int amount){
            deposit(amount);
            
    }
     public void widrowamount(int widrowamount ){
         if(balance>0){
             if(balance>0){
                 balance = balance -widrowamount;
                 System.out.print("balance withrowl successfully");
             }else{
                 System.out.print("Insufficent balance");
             }
         }else{
             System.out.print("balance is 0");
         }
     }
     
     public double getInterest() {
        double balance = getBalance();
        if (balance >= 0 && balance < 100) {
            return balance / 100 * 3;
        } else if (balance >= 100 && balance < 1000) {
            return balance / 100 * 5;
        } else if (balance >= 1000) {
            return balance / 100 * 7;
        } else {
            throw new IllegalArgumentException("Balance cannot be lower than 0");
        }
    }
}
