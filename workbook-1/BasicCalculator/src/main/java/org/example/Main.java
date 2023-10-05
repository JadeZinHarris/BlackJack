package org.example;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number 1: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter number 2: ");
            double num2 = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("What do you want me to do?");
            System.out.print(" \t Enter \n" + "\t (A)dd \n" + "\t (S)ubtract \n" +
                    "\t (M)ultipy \n " +
                    "\t (D)ivide: \n");
            String action = scanner.nextLine();

            double answer = 0;

            System.out.println("Please Select an option...  ");
            if (action.equals("A") ) {
                answer = (num1 + num2);

            } else if (action.equals("S") ) {
                answer = (num1 - num2);

            } else if (action.equals("M")  ) {
                answer = (num1 * num2);

            } else if (action.equals("D") ) {
                answer = (num1 / num2);

            } else {
                System.out.println("Invalid");
            }

            System.out.println(answer);
        }

        }
