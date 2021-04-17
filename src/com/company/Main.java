package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {
        // write your code here

//        method 01
        int x, y;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Set Value for x:");
            x = scanner.nextInt();
            System.out.println("Set Value for y:");
            y = scanner.nextInt();
            System.out.println(x + y);
        } catch (InputMismatchException e) {
            System.out.println("Make sure the input is an integer values!");
        } catch (Exception e) {
            System.out.println("Something went wrong!!Try Again later!");
        }

        //method 02 using throws
        int a, b;
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Set Value for x:");
        a = scanner1.nextInt();
        System.out.println("Set Value for y:");
        b = scanner1.nextInt();
        System.out.println(a + b);
        System.out.println("Make sure the input is an integer values!");

    }
}
