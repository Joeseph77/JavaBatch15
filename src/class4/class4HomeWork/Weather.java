package class4.class4HomeWork;
/*
Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
 */

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your city");
        String city = myScanner.next();
        System.out.println("Please enter the temperature");
        int temp = myScanner.nextInt();
        temp = (int) ((temp - 32) * 0.5556);
        // System.out.println("The temperature is "+(temp-32)*0.5556 +"The city is "+city);
        System.out.println("The temperature is " + temp + " The city is " + city);

    }
}
