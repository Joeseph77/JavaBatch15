package class5.class5HomeWork;
/*
2) Write a program that will print whether it is a weekend or weekday.
If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
 */
import java.util.Scanner;

public class DayType_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter day number");
        int day = scan.nextInt();
        if (day >= 1 && day <= 5) {
            System.out.println("It is a weekday");
        } else if (day == 6 || day == 7) {
            System.out.println("It is a weekend");
        } else {
            System.out.println("Invalid day");
        }
    }
}
