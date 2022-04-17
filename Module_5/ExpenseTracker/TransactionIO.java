import java.util.*;
import java.io.*;

public class TransactionIO{
    private static final String FILE_NAME = "expenses.txt";
    private static File file = new File(FILE_NAME);

    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException{
        PrintWriter output = null;
        if(file.exists()){
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME),true));
        }
        else{
            output = new PrintWriter(FILE_NAME);
        }

        for(Transaction tran : transactions){
            output.print(tran.getDate() + " ");
            output.print(tran.getDescription() + " ");
            output.println(tran.getAmount());
        }
        output.close();
    }

    public static ArrayList<Transaction> findAll() throws IOException{
        File file = new File(FILE_NAME);
        Scanner input = new Scanner(file);
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
        while(input.hasNextLine()){
            String line = input.nextLine();
            String[] line1 = line.split("\\s+");

            for(int i = 1; i < line1.length; i++){
                double str1 = Double.parseDouble(line1[i+1]);
                Transaction transaction = new Transaction(line1[i],str1);
                transactions.add(transaction);
                i = i+2;
            }
        }
        input.close();
        return transactions;
    }
}