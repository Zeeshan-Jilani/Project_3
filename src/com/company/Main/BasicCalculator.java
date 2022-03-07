package com.company.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BasicCalculator {
    public static void main(String[] args) throws IOException{

        float number_1,number_2;
        float sum,prod,sub,div;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--Basic Calculator--\n");
        System.out.println("Enter 1st Number: (and press enter) ");
        number_1 = Float.parseFloat(br.readLine());
        System.out.println("Enter 2nd Number: (and press enter) ");
        number_2 = Float.parseFloat(br.readLine());

        sum = number_1 + number_2;
        prod = number_1 * number_2;
        sub = number_1 - number_2;
        div = number_1 / number_2;

        //sum = (float) Math.round((sum*100.0)/100.0);
        //prod = (float) Math.round((prod*100.0)/100.0);
        //sub = (float) Math.round((sub*100.0)/100.0);
        //div = (float) Math.round((div*100.0)/100.0);

        System.out.println("\nThe sum is: " + number_1 + " and " + number_2 + " is: " + String.format("%.2f",sum));
        System.out.println("The product of " + number_1 + " and " + number_2 + " is: " + String.format("%.2f",prod));
        System.out.println("The difference of " + number_1 + " and " + number_2 + " is: " + String.format("%.2f",sub));
        System.out.println("The quotient of " + number_1 + " and " + number_2 + " is: " + String.format("%.2f",div));

    }
}
