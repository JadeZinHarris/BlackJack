package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What do you want me to do?");
        System.out.print(" Enter '(A)dd' '(S)ubtract' '(M)ultipy' '(D)ivide': ");
        String action = scanner.nextLine();

        System.out.println("Please Select an option...  ");


    }
}