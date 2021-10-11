package com.company;

public class Okrag {
    
    public static double promien;



    public Okrag(int promien)
    {
        this.promien = promien;
    }

    public static double getPowierzchnia()
    {
        return promien*promien*3.14;
    }
    public static double getSrednica()
    {
        return promien*2;
    }
    public static double getPromien()
    {
        return promien;
    }

}


