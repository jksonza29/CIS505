/*
    Author: Janzal Karlo Sonza
    Date: 04/06/2022
*/

public class Bag extends Product{
    private String type = "";

    public Bag(){

    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    @Override
    public String toString(){
        
        return super.toString() + "\n  Type: " + this.type;
    }
}