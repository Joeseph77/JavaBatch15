package class5.class5HomeWork;
/*
4)Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in June, July or August → season =”Summer”.
At the end of the program we should see output as “You were born __”.
 */
import java.util.Scanner;
public class BirthSeason_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your birth month");
        String month = scan.next();
        month =month.toLowerCase();
        switch (month) {
            case "december":
            case "january":
            case "february":
                System.out.println("You were born in Winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("You were born in Spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("You were born in Summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("You were born in fall");
                break;
            default:
                System.out.println("Wrong Month");
        }
    }
}
