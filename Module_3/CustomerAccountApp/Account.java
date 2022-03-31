/*
    Author: Janzal Karlo Sonza
    Date: 03/30/2022
    Purpose: Create an Account class that defines the properties of the Account object
*/

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Account {
    private double balance = 200;

    public double getBalance(){
        return this.balance;
    }

    public double deposit(double amount){
        this.balance = this.balance + amount;
        return this.balance;
    }

    public double withdraw(double amount){
        if(this.balance >= amount){
            this.balance = this.balance - amount;
        }
        return this.balance;
    }

    public void displayMenu(){
        System.out.println("\n  Account Menu");
        System.out.println("  Enter <D/d> for deposit");
        System.out.println("  Enter <W/d> for withdraw");
        System.out.println("  Enter <B/b> for balance");
        System.out.printf("    Enter option>: ");
    }

    public String getTransactionDate(){
        LocalDate dateNow = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyy");
        String date = dateNow.format(format);
        return date;
    }
}
