package com.company.Main;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuadraticEquation {
    public static void main(String[] args) throws IOException{

        double a,b,c,x1,x2,delta,n_roots = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a: ");
        a = Double.parseDouble(br.readLine());
        if (a == 0) {
            System.out.println("Illegal input!!");
        }
        else {
        System.out.println("Enter b: ");
        b = Double.parseDouble(br.readLine());
        System.out.println("Enter c: ");
        c = Double.parseDouble(br.readLine());

        delta = (Math.pow(b,2)-(4*a*c));

        if (delta < 0){
            n_roots = 0;
        }
        else if (delta == 0){
            n_roots = 1;
        }
        else if (delta > 0){
            n_roots = 2;
        }

        switch ((int) n_roots) {
            case 0: {
                System.out.println("There are no roots");
            }
            break;
            case 1: {
                x1 = -b / 2 * a;
                System.out.println("For the following values:-");
                System.out.println("a = " + String.format("%.2f", a));
                System.out.println("b = " + String.format("%.2f", b));
                System.out.println("c = " + String.format("%.2f", c));
                System.out.println("\nx1 = " + String.format("%.2f", x1));
                System.out.println("The trinomial has one root");
            }
            break;
            case 2: {
                x1 = (-b + (Math.sqrt(delta))) / 2 * a;
                x2 = (-b - (Math.sqrt(delta))) / 2 * a;
                System.out.println("For the following values:-");
                System.out.println("a = " + String.format("%.2f", a));
                System.out.println("b = " + String.format("%.2f", b));
                System.out.println("c = " + String.format("%.2f", c));
                System.out.println("\nx1 = " + String.format("%.2f", x1));
                System.out.println("x2 = " + String.format("%.2f", x2));
                System.out.println("The trinomial has two roots");
            }
            break;
        }
        }

    }
}
