package class5.class5HomeWork;
/*
6)Write a program to find largest number among three numbers using nested if provided by a user
(numbers must be distinct
 */
import java.util.Scanner;
public class LargestNumNestedIF_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 > num2)
            if (num1 > num3) {
                System.out.println("num1 is the largest number");
            }
        if (num2 > num1)
            if (num2 > num3) {
                System.out.println("num2 is the largest number");
            } else {
                System.out.println("num3 is the largest number");
            }
    }
}
