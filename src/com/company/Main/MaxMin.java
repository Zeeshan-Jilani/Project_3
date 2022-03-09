package com.company.Main;

import java.util.Random;

public class MaxMin {
    public static void main(String[] args) {

        int max = 101,min = 1,number;
        int i = 1,collectionSize = 10;

        Random rand = new Random();
        System.out.print("Numbers Drawn are: ");

        while (i <= collectionSize){
            number = Math.round(rand.nextInt(100)+1);
            System.out.print(number + ",");

            if (number < max) max = number;
            if (number > min) min = number;

            i++;
        }
        System.out.println("\n\nThe largest number in the collection is: " + min);
        System.out.println("The Smallest number in the collection is: " + max);
    }
}
