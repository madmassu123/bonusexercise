package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scan.nextInt();
        scan.nextLine();
                for (int i = 1; i <= number; i++) {
            if (i % 7 == 0 && i % 17 == 0 && i % 23 == 0) {
                System.out.println("is a multiple of seven, seventeen and Twenty three");
            }
            else if (i % 7 == 0) {
                System.out.println("A multiple of seven");
            }
            else if (i % 17 == 0) {
                System.out.println("A multiple of seventeen");
            }
            else if (i % 23 == 0) {
                System.out.println("A multiple of twenty three");

            }
            if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("fizzBuzz");
                }
                else if (i % 3 == 0) {
                    System.out.println("Fizz");

                }
                else if (i % 5 == 0){
                    System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}


