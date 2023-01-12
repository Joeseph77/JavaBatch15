package class6;

public class WhileLoop3 {
    public static void main(String[] args) {

        boolean condition = true;
        int number = 0;
        while (condition) {
            System.out.println("hello");
            if (number > 3) {
                condition = false;
            }
            number++;
        }
        System.out.println(number);


    }
}
