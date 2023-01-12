package class5.class5HomeWork;
/*
8)HomeWork: Using scanner class create calculator.
Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
 */
import java.util.Scanner;
public class Calculator_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter 2 numbers and the operator");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        char operator = scan.next().charAt(0);
        if (operator == '*') {
            System.out.println(num1*num2);
        } else if (operator == '+') {
            System.out.println(num1+num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else  {
            System.out.println("Operator not available at this moment");
        }
    }
}
