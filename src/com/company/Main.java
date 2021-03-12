package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Creaza un program care accepta numere reale (float) pozitive si negative. Daca nr e pozitiv se afiseaza POZ
         iar daca e negativ se afiseza NEG */
        float x=2.45f;
        float y=-10.95f;
        float z=-5.6f;
        if(x>=0)
            System.out.println("POZ : "+x);
        else
            System.out.println("NEG : "+x);
        if(y<0)
            System.out.println("NEG : "+y );
        else
            System.out.println("POZ : "+y);
        if(z>=0)
            System.out.println("POZ : "+z);
        else
            System.out.println("NEG : "+z);
        Scanner scan1=new Scanner(System.in);
        System.out.println("Introduceti un numar real pozitiv sau negativ");
        float a=scan1.nextFloat();
        if (a>=0)
            System.out.println("POZ - numarul introdus "+a+" e pozitiv");
        else
            System.out.println("NEG -numarul introdus "+a+" e negativ");
    }
}
