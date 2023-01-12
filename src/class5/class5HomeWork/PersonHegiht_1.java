package class5.class5HomeWork;

import java.util.Scanner;

/*1) Prompt the user to enter person heights in inches. Person should be classified as one of the following:
        • short (under 60 inch)
        • medium(between 60 -72 inch)
        • tall (over 72 inch)*/
public class PersonHegiht_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your height");
        int height = scan.nextInt();
        if (height < 60) {
            System.out.println("Short Person");
        } else if (height > 60 && height < 72) {
            System.out.println("Medium Person");
        } else if (height > 72) {
            System.out.println("Tall Person");
        }
    }
}
