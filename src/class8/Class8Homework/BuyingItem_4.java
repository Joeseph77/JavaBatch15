package class8.Class8Homework;
/*
4) Write a program to ask a user to enter item they want to buy and the price of that item.
Every time user enters money accumulate the amount and tell the user how much is left to pay off. If user give more money program should return a change.
Whenever a user done with payments program should say "Thank you for shopping!"
 */
import java.util.Scanner;
public class BuyingItem_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the item you want to buy");
        String item = scan.next();
        System.out.println("Enter the price");
        float price = scan.nextFloat();
        float pay = 0;
        float totalPaid = 0;
      //  float balance = 0;
        while (totalPaid < price) {
            System.out.println("please pay, remaining balance is " + "$" + (price - totalPaid));
            pay = scan.nextFloat();
            totalPaid = totalPaid + pay;
            if (totalPaid > price) {
                System.out.println("Your change is " + "$" + (totalPaid - price));
            }
        }
        System.out.println("Thank you for Shopping");
    }
}


