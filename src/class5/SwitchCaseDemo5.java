package class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleaw Enter you Gender m f");
        char gender=scanner.next().charAt(0);
        //char gender='M';

        switch (gender){

            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            case 'M':
            case 'm':
                System.out.println("Male");
                break;
            default:
                System.out.println("not specified");
        }
    }
}
