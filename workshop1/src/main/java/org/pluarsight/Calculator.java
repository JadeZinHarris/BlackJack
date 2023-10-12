package org.pluarsight;
import java.util.Scanner;



        
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");

        double principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate: ");

        double rate = scanner.nextDouble();

        System.out.println("Enter the term in years: ");

        int term = scanner.nextInt();

        Mortgage mortgage = new Mortgage(principal, rate, term);

        double monthlyPayment = mortgage.getMonthlyPayment();

        System.out.println("The monthly payment is:");
        System.out.println(monthlyPayment);

        System.out.println("Deposit:  ");
        double deposit = scanner.nextDouble();

        System.out.println("years:  ");
        double years = scanner.nextInt();

        System.out.println("interest:  ");
        double interestRate = scanner.nextDouble();

        scanner.close();

        futureValue futureValue = new futureValue(deposit, interestRate, (int) years);
        double totalInterest = futureValue.getFuture();

        System.out.println("The future value is: ");
        System.out.println(totalInterest);



    }
}


class Mortgage {

    private double principal;
    private double rate;
    private int term;


    public Mortgage(double principal, double rate, int term) {
        this.principal = principal;
        this.rate = rate;
        this.term = term;
    }


    public double getMonthlyPayment() {

        double monthlyRate = rate / 100 / 12;

        int payments = term * 12;

        double monthlyPayment = principal * (monthlyRate * Math.pow(1 + monthlyRate, payments)) / (Math.pow(1 + monthlyRate, payments) - 1);

        return monthlyPayment;



    }
}

class futureValue {
    private double deposit;
    private double interestRate;
    private int years;


    public futureValue( double deposit, double interestRate, int years ) {
        this.deposit = deposit;
        this.years = years;
        this.interestRate = interestRate;


        }


    public double getFuture() {
        double futureTotal = (deposit * Math.pow( 1 + interestRate, years) );

        double totalInterest = futureTotal - deposit;

        return totalInterest;
    }
}

