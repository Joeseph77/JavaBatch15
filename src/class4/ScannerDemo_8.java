package class4;

import java.util.Scanner;

public class ScannerDemo_8 {

    public static void main(String[] args) {
        //Below line helps us to get the input from the keyboard
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name  = input1.nextLine();
        System.out.println(name);
        System.out.println("Test passed "+name);


    }
}
