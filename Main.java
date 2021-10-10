package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
    //Zadanie 6
    System.out.println(getTriplled(4));
    //Zadanie 7
        System.out.println(getSqrt(3));
        //Zadanie 8
        System.out.println("Podaj a : ");
        int alos = scan.nextInt();
        System.out.println("Podaj b : ");
        int blos = scan.nextInt();
        int a, b, c;
        if(alos < blos)
        {
            a = rand.nextInt(blos + 1 - alos) + alos;
            b = rand.nextInt(blos + 1 - alos) + alos;
            c = rand.nextInt(blos + 1 - alos) + alos;
        }
        else
        {
            a = rand.nextInt(alos + 1 - blos) + blos;
            b = rand.nextInt(alos + 1 - blos) + blos;
            c = rand.nextInt(alos + 1 - blos) + blos;
        }
        System.out.println(checkTrojkat(a, b, c));


    }
    public static double getTriplled(int y)
    {
        return Math.pow(y, 3);
    }

        public static double getSqrt(int x)
        {
            return Math.sqrt(x);
        }

        public static int checkTrojkat(int a, int b, int c)
        {
            if(a > b)
            {
                if(a > c)
                {
                    if(a*a == b*b + c*c)
                    {
                        return 1;
                    }
                    else
                    {
                        return 0;
                    }
                }
                else
                {
                    if(c*c == a*a + b*b)
                    {
                        return 1;
                    }
                    else
                    {
                        return 0;
                    }
                }
            }
            else if(b > c)
            {
                if(b*b == c*c + a*a)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }

            }
            else
            {
                if(c*c == a*a + b*b)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }

        }


}
