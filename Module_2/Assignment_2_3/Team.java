/*
    Author: Janzal Karlo Sonza
    Date: 03/24/2022
    Purpose: Create a Team class that defines the properties of the Team object and chcaracteristics
*/

public class Team {
    public String teamName;
    private String[] players = new String[20];
    private int playerCount = 0;

    public Team(String teamName){
        this.teamName = teamName;
    }

    public void addPlayer(String player){
        players[this.playerCount] = player;
        this.playerCount++;
    }

    public String[] getPlayers(){
        return this.players;
    }

    public int getPlayerCount(){
        return this.playerCount;
    }

    public String getTeamName(){
        return this.teamName;
    }
}
