package com.company.Main;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BMIcalculator {
    public static void main(String[] args) throws IOException{

        float person_height,person_weight;
        double bmi_value;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--BMI Index Calculator--\n");
        System.out.println("Enter your weight in kg: (press Enter) ");
        person_weight = Float.parseFloat(br.readLine());
        System.out.println("Enter your height in meters: (press Enter) ");
        person_height = Float.parseFloat(br.readLine());

        bmi_value = person_weight/Math.pow(person_height,2);

        if (bmi_value < 16.0){
            System.out.println("Please check if the inputted height and weight values are right!");
        }
        else if (bmi_value == 16.0){
            System.out.println(String.format("%.2f",bmi_value) + " - Starvation");
        } else if (bmi_value > 16.0 && bmi_value <= 16.99) {
            System.out.println(String.format("%.2f",bmi_value) + " - Emaciation");
        }
        else if (bmi_value >= 17.0 && bmi_value <= 18.49){
            System.out.println(String.format("%.2f",bmi_value) + " - Underweight");
        }
        else if (bmi_value >= 18.50 && bmi_value <= 22.99){
            System.out.println(String.format("%.2f",bmi_value) + " - normal, LowRange");
        }
        else if (bmi_value >= 23.0 && bmi_value <= 24.99){
            System.out.println(String.format("%.2f",bmi_value) + " - normal, HighRange");
        }
        else if (bmi_value >= 25.0 && bmi_value <= 27.49){
            System.out.println(String.format("%.2f",bmi_value) + " - overweight, LowRange");
        }
        else if (bmi_value >= 27.50 && bmi_value <= 29.99){
            System.out.println(String.format("%.2f",bmi_value) + " - overweight, HighRange");
        }
        else if (bmi_value >= 30.0 && bmi_value <= 34.9){
            System.out.println(String.format("%.2f",bmi_value) + " - 1st degree obesity");
        }
        else if (bmi_value >= 35.0 && bmi_value <= 39.9){
            System.out.println(String.format("%.2f",bmi_value) + " - 2nd degree obesity");
        }
        else if (bmi_value == 40){
            System.out.println(String.format("%.2f",bmi_value) + " - 3rd degree obesity");
        }
        else {
            System.out.println("Please check if the inputted height and weight values are right!");
        }
    }
}
