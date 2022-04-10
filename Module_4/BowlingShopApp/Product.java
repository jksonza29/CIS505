/*
    Author: Janzal Karlo Sonza
    Date: 04/06/2022
    Purpose: Create a super class "product" along with sub classes "ball", "bag", and "shoe".
*/

public class Product {
    private String code = "";
    private String description = "";
    private double price = 0;
    
    public Product(){

    }

    public String getCode(){
        return this.code;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }

    public void setCode(String code){
        this.code = code;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        System.out.printf("  Product code: " + this.code +"\n  Description: " + this.description + "\n  Price: $%,6.2f",this.price);
        return "";
    }
}
