package class4.class4HomeWork;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Do you hava a credit card?");
        boolean creditCard = myScanner.nextBoolean();
        if (creditCard) {
            System.out.println("What is the balance on the card?");
            int balance = myScanner.nextInt();
            if (balance >1000){
                System.out.println("Please, pay off the balance immediately");
            } else {
                System.out.println("You can spend more");
            }
        } else {
            System.out.println("Would you like to get a new Card?");
        }
    }
}
