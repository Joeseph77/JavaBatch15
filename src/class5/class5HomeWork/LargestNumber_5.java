package class5.class5HomeWork;
/*
5) Write a program to find largest of three double values using if-else..if and logical operators provided by a user
(numbers must be distinct)
 */
import java.util.Scanner;

public class LargestNumber_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        double num1=scan.nextDouble();
        double num2=scan.nextDouble();
        double num3=scan.nextDouble();

        if(num1>num2 && num1>num3) {
            System.out.println("num1 is the largest number");
        } else if (num2>num1 && num2>num3) {
            System.out.println("num2 is the largest number");
        } else {
            System.out.println("num3 is the largest number");
        }


    }
    }
