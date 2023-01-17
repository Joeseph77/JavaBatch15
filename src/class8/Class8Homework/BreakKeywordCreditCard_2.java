package class8.Class8Homework;
/*
Create a program that will be asking user to apply for a credit card 10 times.
As soon you get an “yes” from a user program should stop asking.
 */
import java.util.Scanner;
public class BreakKeywordCreditCard_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to apply for a credit Card?");
        boolean creditCard = scan.nextBoolean();
        for (int i = 0; i <= 10; i++) {
            while (!creditCard) {
                System.out.println("Would you like to apply for a credit Card?");
                creditCard = scan.nextBoolean();
                break;
            }
        }
    }
}
