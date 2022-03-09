package com.company.Main;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AddEvenNumbers {
    public static void main(String[] args) throws IOException{

        //just adding the even numbers from 0 to 100 was quite easy, so I did this task with a twist
        //this program adds all the even numbers from the number that
        //the user inputs, instead of starting from 0.
        //I hope you won't mind (:

        float even_number, sum = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an even number: ");
        even_number = Float.parseFloat(br.readLine());

        if (even_number % 2 != 0){
            System.out.println("Invalid Input!!");
        }
        else {
            for (float i = even_number; i <= 100; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println("The Sum of even numbers is: " + String.format("%.2f", sum));
        }

    }
}
