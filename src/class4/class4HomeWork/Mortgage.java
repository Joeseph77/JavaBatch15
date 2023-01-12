package class4.class4HomeWork;
/*
Create a Java program and store values of mortgage rate and mortgage price.
First, program should check if rate is higher than 4.5
user will not buy a house, otherwise user will consider buying.
Once user decides to buy a house, if price of the house is larger than 200000
than user will take a loan, otherwise user will pay cash.
You are a loan specialist and you need to ask user what is the amount of loan is needed.
If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
 */
public class Mortgage {

    public static void main(String[] args) {
        float morgRate = 4.5f;
        int housePrice = 210000;
        int loanAmount = 210000;

        if (morgRate < 4.5) {
            System.out.println("Will consider buying a house");
            if (housePrice > 200000) {
                System.out.println("Will take a loan");
                if (loanAmount <= 200000) {
                    System.out.println("User will be able to take a loan");
                } else {
                    System.out.println("Loan Rejected");
                }
            }
        } else {
            System.out.println(" Will not buy a house");
        }
    }
}
