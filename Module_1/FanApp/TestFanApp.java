/*
    Author: Janzal Karlo Sonza
    Date: 03/19/2022
    Purpose: Create fan objects and output the results 
*/
public class TestFanApp {
    // main method
    public static void main(String[] args) {
        //instantiate two instances of the fan object in the fan class
        //fan1 uses default constructor
        //fan2 uses overloaded constructor
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(2,true,8,"Blue");
        //output custom overridden toString method - this is actually how you do it
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}