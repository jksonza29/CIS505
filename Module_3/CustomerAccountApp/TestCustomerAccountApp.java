/*
    Author: Janzal Karlo Sonza
    Date: 03/30/2022
    Purpose: Create a TestCustomerAccountApp class that tests the Customer Account App
*/

import java.util.Scanner;

public class TestCustomerAccountApp {
    public static void main(String[] args){
        Boolean cont = false;
        double balance = 0;
        double amount = 0;
        String next = "";
        String customerID = "";
        Customer customer = new Customer();

        try (// Creeate new scanner for user unput
        Scanner myScanner = new Scanner(System.in)) {
            // Print greeting for app
            System.out.println("  Welcome to the Customer Account App\n");

            System.out.println("  Enter a customer ID:");
            System.out.printf("    ex: 1007, 1008, 1009>: ");
            customerID =  myScanner.nextLine();

            customer = CustomerDB.getCustomer(Integer.valueOf(customerID));
            Account account = new Account();
   
            while(cont.equals(false)){
                account.displayMenu();
                next = myScanner.nextLine();

                if(next.equals("D") || next.equals("d")){
                    System.out.printf("\n  Enter deposit amount: ");
                    amount = Double.valueOf(myScanner.nextLine());
                    balance = account.deposit(amount);
                    System.out.println();
                 }

                 else if(next.equals("W") || next.equals("w")){
                    System.out.printf("\n  Enter withdraw amount: ");
                    amount = Double.valueOf(myScanner.nextLine());
                    balance = account.withdraw(amount);
                    System.out.println();
                 }

                else if(next.equals("B") || next.equals("b")){
                   balance = account.getBalance();
                   System.out.printf("\n  Account Balance: $%,6.2f\n", balance);
                }
                else {
                    System.out.println("\n  Error: Invalid option\n");
                }

                System.out.printf("  Continue? (y/n): ");
                next = myScanner.nextLine();

                if(next.equals("n")){
                    System.out.println(customer);
                    System.out.printf("\n  Balance as of " + account.getTransactionDate() + " is $%,6.2f\n\n", account.getBalance());
                    System.out.println("  End of line...");
                    cont = true;
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
