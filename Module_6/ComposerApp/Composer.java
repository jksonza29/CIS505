/*
    Author: Janzal Karlo Sonza
    Date: 04/21/2022
*/

import java.util.*;

public class Composer {
    private int id = 0;
    private String name = "";
    private String genre = "";

    public Composer(){

    }

    public Composer(int id, String name, String genre){
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public void setID(int id){
        this.id = id;
    }

    public int getID(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getGenre(){
        return this.genre;
    }
}
