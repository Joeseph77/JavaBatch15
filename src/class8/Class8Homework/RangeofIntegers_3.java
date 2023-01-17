package class8.Class8Homework;
/*Write a program that reads a range of integers (start and end point),
provided by a user and then from that range prints the sum of the even and odd integers.
 */
import java.util.Scanner;
public class RangeofIntegers_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sumEven = 0;
        int sumOdd=0;
        for (int i = num1; i <= num2; i++) {
        if(i%2==0) {
           // int sumEven=0;
            sumEven=sumEven+i;
        } else {
         //   int sumOdd=0;
            sumOdd=sumOdd+i;
        }
        }
        System.out.println("Sum of even numbber "+sumEven);
        System.out.println("Sum of odd numbber "+sumOdd);
    }
}