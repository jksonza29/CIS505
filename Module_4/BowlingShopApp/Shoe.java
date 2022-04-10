/*
    Author: Janzal Karlo Sonza
    Date: 04/06/2022
*/

public class Shoe extends Product{
    private double size = 0;

    public Shoe(){

    }

    public double getSize(){
        return this.size;
    }

    public void setSize(double size){
        this.size = size;
    }

    @Override
    public String toString(){
        return super.toString() + "\n  Size: " + this.size;
    }
}