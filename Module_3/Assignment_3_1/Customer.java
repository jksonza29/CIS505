/*
    Author: Janzal Karlo Sonza
    Date: 03/30/2022
    Purpose: Create a Customer class that defines the properties of the Customer object
*/

public class Customer {
    private String name;
    private String address;
    private String city;
    private String zip;

    public Customer(){
        this.name = "John Doe";
        this.address = "100 N Los Angeles";
        this.city = "Los Angeles";
        this.zip = "90001";
    }

    public Customer(String name, String address, String city, String zip){
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getCity(){
        return this.city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getZip(){
        return this.zip;
    }

    public void setZip(String zip){
        this.zip = zip;
    }

    @Override
    public String toString(){
        return "\n  --Customer Details--" + "\n  Name: " + this.name + "\n  Address: " + this.address + "\n  City: " + this.city + "\n  Zip: " + this.zip;
    }
}