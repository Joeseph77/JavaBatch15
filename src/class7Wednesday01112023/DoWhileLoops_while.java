package class7Wednesday01112023;

import java.util.Scanner;

public class DoWhileLoops_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int number;
        int number = 3;
        while (number != 5) {
            System.out.println("Please enter a number");
            number = scanner.nextInt();

        }
    }
}
