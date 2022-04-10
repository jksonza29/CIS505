/*
    Author: Janzal Karlo Sonza
    Date: 04/06/2022
*/

public class Ball extends Product{
    private String color = "";

    public Ball(){

    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return super.toString() +  "\n  Color: " + this.color;
    }
}
