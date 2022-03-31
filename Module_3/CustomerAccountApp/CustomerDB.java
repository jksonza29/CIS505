/*
    Author: Janzal Karlo Sonza
    Date: 03/30/2022
    Purpose: Create a CustomerDB class that defines the properties of the CustomerDB object
*/

public class CustomerDB {
    public static Customer getCustomer(int ID){
        Customer newCustomer = new Customer();
        
        if(ID == 1007){
            newCustomer.setName("Jennifer Patterson");
            newCustomer.setAddress("8422 Grover Ave.");
            newCustomer.setCity("Bellevue");
            newCustomer.setZip("68123");
        }
        else if(ID == 1008){
            newCustomer.setName("Janzal Karlo Sonza");
            newCustomer.setAddress("2895 Briarpatch Dr");
            newCustomer.setCity("Simi Valley");
            newCustomer.setZip("93065");
        }
        else if(ID == 1009){
            newCustomer.setName("Kevin Leiour");
            newCustomer.setAddress("7923 Reseda Bl.");
            newCustomer.setCity("Reseda");
            newCustomer.setZip("91335");
        }

        return newCustomer;
    }
}