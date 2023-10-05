package payroll.list;
import java.util.Scanner;



public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please input your name: ");
        String name = scanner.nextLine();



        System.out.println("How many hours did you work? ");
        float num1 = scanner.nextFloat();
        System.out.println("What is your payrate? ");
        float num2 = scanner.nextFloat();

        Object work = num1 * num2;


        System.out.println("Worker " + "\t \n" + name +"\t \n" + "\t  Gross income is \n " + work);


    }
}


















