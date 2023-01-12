package class2;

public class StringAddition {
    public static void main(String[] args) {

        String firstName = "George";
        String lastName = "Michael";
/*
java executes code from top to bottom but if we have multiple operations on the same lines it executes them from left to right
 */

        System.out.println("*****"+firstName+"  "+lastName+"****");
        System.out.println("First name =" +firstName);
        System.out.println("Last Name =" +lastName);
        System.out.println("10"+"10");
        String space=" ";
        System.out.println(firstName+space+lastName);
        System.out.println(firstName+" "+lastName);
        // with String you can combine any data type (not like integer and decimal)

        System.out.println(firstName+10);

    }

}
