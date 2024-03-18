package edu.upc.dsa.androidcalculator;

public class Tangent implements Operation{
    public double operation(double a, double b){
        double sol=Math.tan(a);
        if(b==0) //en radians
            return  Math.toRadians(sol);
        else
            return Math.toDegrees(sol);
    }
}
