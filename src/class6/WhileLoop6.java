package class6;

public class WhileLoop6 {
    public static void main(String[] args) {

        int number = 1;
        while (number < 5) {
            System.out.println(number);
            number++;
        }
        System.out.println("final number " + number);
        int number2 = 0;
        while (number2 < 10) {
            System.out.println(number2);
            number2 += 2;
        }

        System.out.println("number from 1 to 100");
        int number3 = 1;
        while (number3 < 100) {
            System.out.println(number3);
            number3++;
        }

        System.out.println("odd numbers from 1 to 15");
        int number4 = 1;
        while (number4 <= 15) {
            System.out.println(number4);
            number4 += 2;
        }

        System.out.println("numbers 5,10,15.....,50");
        int number5 = 5;
        while (number5 <= 50) {
            System.out.println(number5);
            number5 += 5;
        }


        System.out.println("decrement");
        int number6 = 10;
        while (number6 >0) {
            System.out.println(number6);
            number6--;
        }
    }
}