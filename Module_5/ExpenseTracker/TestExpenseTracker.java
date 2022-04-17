import java.io.*;
import java.util.*;

public class TestExpenseTracker {
    public static void main(String args[]) throws FileNotFoundException{
        String menu = "  MENU OPTIONS\n    1. View Transactions\n    2. Add Transactions\n    3. View Expenses\n\n  Please choose and option: ";
        Scanner sc = new Scanner(System.in);
        int input = 0;
        String next = "y";

        System.out.println("  Welcome to the Expense Tracker");

        while(!next.equalsIgnoreCase("n")){
            System.out.println();
            input = ValidatorIO.getInt(sc, menu);

            if(input == 2){
                String c = "y";
                ArrayList<Transaction> transactions = new ArrayList<>();

                while(c.equalsIgnoreCase("y")){
                    String description = ValidatorIO.getString(sc, "\n  Enter the description: ");
                    double amount = ValidatorIO.getDouble(sc, "\n  Enter the amount: ");

                    Transaction transaction = new Transaction(description, amount);

                    transactions.add(transaction);

                    c = ValidatorIO.getString(sc,"\n  Add another transaction? (y/n): ");
                }

                try{
                    TransactionIO.bulkInsert(transactions);
                }
                catch(IOException e){
                    System.out.println("\n  Exception: " + e.getMessage());
                }

            }

            if(input == 1){
                try{
                    File file = new File("expenses.txt");
                    Scanner txtFile = new Scanner(file);
                    System.out.println("\n  MONTHLY EXPENSES\n");
                    while(txtFile.hasNextLine()){
                        String line = txtFile.nextLine();
                        String[] line1 = line.split("\\s+");
                        for(int i = 0; i<line1.length;i++){
                            System.out.println("  Date:  " + line1[i]);
                            i++;
                            System.out.println("  Description: " + line1[i]);
                            i++;
                            double str1 = Double.parseDouble(line1[i]);
                            System.out.printf("  Amount: $%,6.2f\n\n", str1);
                        }
                    }

                    next = ValidatorIO.getString(sc,"\n  Continue? (y/n): ");
                
                    if(next.equalsIgnoreCase("n")){
                        System.out.println("\n  Programm terminated by the user...");
                    }

                    txtFile.close();

                }
                catch(IOException e){
                    System.out.println("\n  Exception: " + e.getMessage());
                }
            }

            if(input == 3){
                double monthlyExpense = 0;

                try {
                    ArrayList<Transaction> transactions = TransactionIO.findAll();
                    for(Transaction transaction : transactions){
                        monthlyExpense += transaction.getAmount();
                    }

                } catch (IOException e) {
                    System.out.println("\n  Exception: " + e.getMessage());
                }

                System.out.printf("\n  Your total monthly expense is $%,6.2f\n",monthlyExpense);

                next = ValidatorIO.getString(sc,"\n  Continue? (y/n): ");
                
                if(next.equalsIgnoreCase("n")){
                    System.out.println("\n  Programm terminated by the user...");
                }
            }
        }
    }
}
