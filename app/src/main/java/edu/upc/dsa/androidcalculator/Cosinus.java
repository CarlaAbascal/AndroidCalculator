package edu.upc.dsa.androidcalculator;

public class Cosinus implements Operation{
    public double operation(double a, double b){
        double sol=Math.cos(a);
        if(b==0) //en radians
            return  Math.toRadians(sol);
        else
            return Math.toDegrees(sol);
    }
}
