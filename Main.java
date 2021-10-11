package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        double bok1, bok2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj 1 bok prostokata: ");
        bok1 = scan.nextInt();
        System.out.print("Podaj 2 bok prostokata: ");
        bok2 = scan.nextInt();
        Okrag.promien = Math.sqrt(bok1 * bok1 + bok2 * bok2) / 2;
        System.out.println("Promien okregu opisanego na tym prostokacie wynosi : " + Okrag.getPromien());
        System.out.println("Powierzchnia okregu opisanego na tym prostokacie wynosi : " + Okrag.getPowierzchnia());
        System.out.println("Srednica okregu opisanego na tym prostokacie wynosi : " + Okrag.getSrednica());
        if(bok1 > bok2)
        {
            Okrag.promien = bok2 / 2;
        }
        else
        {
            Okrag.promien = bok1 / 2;
        }
        System.out.println("Promien okregu wpisanego w ten prostokat wynosi : " + Okrag.getPromien());
        System.out.println("Powierzchnia okregu wpisanego w ten prostokat wynosi : " + Okrag.getPowierzchnia());
        System.out.println("Srednica okregu wpisanego w ten prostokat wynosi : " + Okrag.getSrednica());

    }
    }
