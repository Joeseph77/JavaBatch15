package class5.class5HomeWork;
/*
Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average,
D-Bad, any other grade --> Not Acceptable. At the end your program should print which grade was entered by a user with explanation.
 */
import java.util.Scanner;
public class UserGade_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your grade");
        char grade = scan.next().charAt(0);
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("you got A, that is Excellent");
                break;
            case 'B':
            case 'b':
                System.out.println("you got B, that is Good");
                break;
            case 'C':
            case 'c':
                System.out.println("you got C, that is Average");
                break;
            case 'D':
            case 'd':
                System.out.println("you got D, that is Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }
    }
}