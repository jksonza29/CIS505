/*
    Author: Janzal Karlo Sonza
    Date: 04/14/2022
*/

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Transaction {
    private String date = "";
    private String description = "";
    private double amount = 0;

    public Transaction(){
        LocalDate dateNow = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyy");
        this.date = dateNow.format(format);
    }

    public Transaction(String description, double amount){
        LocalDate dateNow = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyy");
        this.date = dateNow.format(format);
        this.description = description;
        this.amount = amount;
    }

    public void setDate(){
        LocalDate dateNow = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyy");
        this.date = dateNow.format(format);
    }

    public String getDate(){
        return this.date;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return this.amount;
    }
}
