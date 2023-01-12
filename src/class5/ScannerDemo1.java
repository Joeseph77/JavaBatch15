package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        //scan.nextLine(); // trick to make nextline to work after we have used any other method
        //from the scanner class so it allows to take multiple words on the same line
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName = scan.nextLine();
        System.out.println("your full name "+fullName);
        scan.close(); // very good practice


    }



}
