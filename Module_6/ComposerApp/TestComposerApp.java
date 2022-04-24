/*
    Author: Janzal Karlo Sonza
    Date: 04/21/2022
*/

import java.util.*;

public class TestComposerApp {

    public static void main(String args[]){
        boolean cont = true;
        String next = "";
        Scanner myScanner = new Scanner(System.in);
        MemComposerDao MemComposerDao = new MemComposerDao();
        System.out.println("  Welcome to the Composer App");
        while(cont == true){
            System.out.println("\n  MENU OPTIONS");
            System.out.println("    1. View Composers");
            System.out.println("    2. Find Composer");
            System.out.println("    3. Add Composer");
            System.out.println("    4. Exit\n");
            System.out.printf("  Please choose an option: ");
            next = myScanner.nextLine();

            if(Integer.valueOf(next).equals(4)){
                cont = false;
            }

            else if (Integer.valueOf(next).equals(1)){
                List<Composer> composers =  MemComposerDao.findAll();
                System.out.println("\n\n  --DISPLAYING COMPOSERS--");
                for(Composer composer : composers){
                    System.out.println("  Id: " + composer.getID());
                    System.out.println("  Name: " + composer.getName());
                    System.out.println("  Genre: " + composer.getGenre() + "\n");
                }
            }

            else if (Integer.valueOf(next).equals(2)){
                System.out.printf("\n  Enter an id: ");
                next = myScanner.nextLine();
                Composer composer = MemComposerDao.findBy(Integer.valueOf(next));
                if (composer == null){
                    System.out.println("\n  Error: No composer found.");
                }
                else{
                    System.out.println("\n\n  --DISPLAYING COMPOSER--");
                    System.out.println("  Id: " + composer.getID());
                    System.out.println("  Name: " + composer.getName());
                    System.out.println("  Genre: " + composer.getGenre());
                }
            }

            else if (Integer.valueOf(next).equals(3)){
                System.out.printf("\n  Enter an id: ");
                int id = Integer.valueOf(myScanner.nextLine());
                System.out.printf("  Enter a name: ");
                String name = myScanner.nextLine();
                System.out.printf("  Enter a genre: ");
                String genre = myScanner.nextLine();
                MemComposerDao.insert(new Composer(id,name,genre));
            }

        }
    }
}
