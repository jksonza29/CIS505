/*
    Author: Janzal Karlo Sonza
    Date: 03/24/2022
    Purpose: Create Team objects and output the results
*/

import java.util.Scanner;

public class TestSportsTeamApp {
    public static void main(String[] args){
        Boolean cont = true;

        // Creeate new scanner for user unput
        Scanner newScanner = new Scanner(System.in);

        // Print greeting for app
        System.out.println("  Welcome to the Sports Team App.");

        // While user wishes to continue
        while(cont.equals(true)){
            // Prompt user to enter a team name
            System.out.printf("\n  Enter a team name: ");

            // Wait for user input
            String teamName =  newScanner.nextLine();

            // Create a team with user inputted name
            Team sportTeam = new Team(teamName);

            // Prompt user to entear team member names
            System.out.println("\n  Enter the player names:");
            System.out.printf("    hint: use commas for multiple players; no spaces>: ");
            String playersInput = newScanner.nextLine();
            String[] playersArray = playersInput.split(",");
            for (int i = 0; i < playersArray.length; i++){
                sportTeam.addPlayer(playersArray[i]);
            }
            System.out.println("\n  ---Team Summary---");
            System.out.println("  Number of players in team: " + sportTeam.getPlayerCount());
            String[] theTeamPlayers = sportTeam.getPlayers();
            System.out.printf("  Players on team: ");
            for (int i = 0; i < sportTeam.getPlayerCount(); i++){
                System.out.printf(theTeamPlayers[i] + ",");
            }
            System.out.println();
            System.out.printf("\n  Continue? (y/n): ");
            String contVar = newScanner.nextLine();
            if (contVar.equals("n")){
                System.out.println("  \n");
                System.out.println("  End of line...");
                cont = false;
            } 
        }
    }
}
