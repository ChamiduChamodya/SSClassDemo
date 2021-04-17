package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {
        // write your code here

//ClassNotFoundException
//        try {
//            Class.forName("oracle.jdbc.driver.mysqlDriver");
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.toString());
//        } catch (Exception ex) {
//            System.out.println("Something went Wrong");
//        } finally {
//            System.out.println("Garbage Collection is activated");
//        }

//CloneNotSupportedException
        Employee emp1 = new Employee("Rohit");
        System.out.println(emp1);
        try {
            Employee emp2 = (Employee) emp1.clone();
            System.out.println(emp2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone Not Supported");
        }

//        method 01 using try catch to handel an exception
//        int x, y;
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.println("Set Value for x:");
//            x = scanner.nextInt();
//            System.out.println("Set Value for y:");
//            y = scanner.nextInt();
//            System.out.println(x + y);
//        } catch (InputMismatchException e) {
//            System.out.println("Make sure the input is an integer values!");
//        } catch (Exception e) {
//            System.out.println("Something went wrong!!Try Again later!");
//        }
//
//        //method 02 using throws
//        int a, b;
//        Scanner scanner1 = new Scanner(System.in);
//
//        System.out.println("Set Value for x:");
//        a = scanner1.nextInt();
//        System.out.println("Set Value for y:");
//        b = scanner1.nextInt();
//        System.out.println(a + b);
//        System.out.println("Make sure the input is an integer values!");

    }
}

class Employee {

    private String name;

    public Employee(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee[Name= " + name + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

