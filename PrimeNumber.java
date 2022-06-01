package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean prime(int num) {
        for (int i = 2; i <= num/i; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Lower Number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Upper Number");
        int num2 = scanner.nextInt();
        if (num1 < num2){
        for (int j = num1; j < num2; j++) {
            if (prime(j)) {
                System.out.println(j);
            }
        }
        }else {
            System.out.println("Your Have Entering the Upper Number is Less than Lower Number");
        }
    }
}