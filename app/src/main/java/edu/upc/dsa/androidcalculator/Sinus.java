package edu.upc.dsa.androidcalculator;

public class Sinus implements Operation{
    public double operation(double a, double b){
            double sol=Math.sin(a);
            if(b==0) //radians
                return  Math.toRadians(sol);
            else
                return Math.toDegrees(sol);
        }
    }
