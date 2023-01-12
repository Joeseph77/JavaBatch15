package class4.class4HomeWork;

import java.util.Scanner;

public class UserBonus {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter number of worked years");
        int workedYears = myScanner.nextInt();
        if (workedYears >= 5) {
            System.out.println("User is eligible for a bonus");
            System.out.println("Please enter the annual salary");
            int annualSalary = myScanner.nextInt();
            if (annualSalary > 50000) {
                System.out.println("Bonus = 5000");
            } else {
                System.out.println("Bonus = 3000");
            }
        } else {
            System.out.println("User is not eligible for a bonus");
        }

    }
}
