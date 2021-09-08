/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package org.example;
import java.util.Scanner;

public class assignment12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //ask for principal
        System.out.println("Enter the principal:");
        double principal = scan.nextDouble();

        //ask for rate of interest and convert number to percentage
        System.out.println("Enter the rate of interest:");
        double interest = scan.nextDouble() / 100;

        //ask for time in years
        System.out.println("Enter the number of years:");
        double years = scan.nextDouble();

        //print out the output
        double investment = (principal * interest * years);
        System.out.println("After " + years + " years at " + (interest*100) + "%, the investment will be worth $" + (String.format("%.2f",investment+principal)));
    }
}
