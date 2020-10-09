package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] mas1 = new int[10];
        mass(mas1);
        int[] mas2 = new int[10];
        mass(mas2);
        int[] mas3 = new int[10];
        mass(mas3);
        int[] mas4 = new int[10];
        mass(mas4);
        int[] mas5 = new int[10];
        mass(mas5);

    }

    public static void mass (int[] a){

        for (int i = 0; i < a.length; i++) {
            int c = (int)(100 - Math.random() * 200);
            a[i] = c;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println("");
    }
}

