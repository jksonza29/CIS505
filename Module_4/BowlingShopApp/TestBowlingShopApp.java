import java.util.*;

public class TestBowlingShopApp {
    public static void displayMenu(){
        System.out.println("  MENU OPTIONS");
        System.out.println("    1. <b> Bowling Balls");
        System.out.println("    2. <a> Bowling Bags");
        System.out.println("    3. <s> Bowling Shoes");
        System.out.println("    4. <x> To exit\n");
        System.out.printf("  Please choose an option: ");
    }

    public static void main(String[] args){
        String next = "";
        Scanner myScanner = new Scanner(System.in);


        System.out.println("  Welcome to the Bowling Shop\n\n");

        GenericQueue products = new GenericQueue<Product>();
        
        
        
        while(next != "x"){

            displayMenu();
            next = myScanner.nextLine();

            if(next.equalsIgnoreCase("x")){
                System.out.println("\n\n  End of line...");
                break;
            }

            products = ProductDB.getProducts(next);

            System.out.println("\n  --Product Listing--");

            while(products.size()>0){
                System.out.println(products.dequeue());
                System.out.println();
            }
            System.out.println();
        }
        
    }
}
