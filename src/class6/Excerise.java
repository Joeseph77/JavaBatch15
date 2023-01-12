package class6;

public class Excerise {
    public static void main(String[] args) {

        int num1 = 170;
        int num2 = 170;
        int num3 = 100;

        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is the biggest number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is the biggest number");

        } else {
            System.out.println("num3 is the biggest number");
        }
    }
}
