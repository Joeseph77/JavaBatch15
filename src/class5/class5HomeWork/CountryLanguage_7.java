package class5.class5HomeWork;
/*
7) Ask user to enter their country and capture it. Once values are captured print which language user speaks.
use any 5 countries. No need to make this task for all the countries. Find top 5 and hardcode them.
 */
import java.util.Scanner;
public class CountryLanguage_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your Country");
        String country = scan.next();
        country = country.toLowerCase();
        switch (country) {
            case "italy":
                System.out.println("User speakes italian");
                break;
            case "egypt":
                System.out.println("User speakes arabic");
                break;
            case "usa":
                System.out.println("User speakes english");
                break;
            case "mexico":
                System.out.println("User speaks spanish");
                break;
            case "france":
                System.out.println("User speaks french");
                break;

            default:
                System.out.println("Entered country not on the list yet");
        }
    }
}

