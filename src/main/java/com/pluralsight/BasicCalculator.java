package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int numberTwo = scanner.nextInt();

        System.out.println("Possible calcualtions: ");
        System.out.println("(A)dd");
        System.out.println("(S)subtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        char option = scanner.next().charAt(0);

        switch (option){
            case 'A':
                System.out.println(number + " + " + numberTwo + " = " + (number + numberTwo));
                break;
            case 'S':
                System.out.println(number + " - " + numberTwo + " = " + (number - numberTwo));
                break;
            case 'M':
                System.out.println(number + " * " + numberTwo + " = " + (number * numberTwo));
                break;
            case 'D':
                System.out.println(number + " / " + numberTwo + " = " + (number / numberTwo));
                break;
            default:
                System.out.println("Your input is invalid");
        }
    }
}
