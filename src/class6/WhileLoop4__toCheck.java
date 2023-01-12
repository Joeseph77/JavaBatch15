package class6;

public class WhileLoop4__toCheck {
    public static void main(String[] args) {

        boolean condition = true;
        int number = 0;
        while (condition) {
            System.out.println("hello");
            if (number > 3)  {
                condition = false;
            }
            number++;
        }


    }
}
