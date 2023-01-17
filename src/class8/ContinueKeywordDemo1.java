package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                continue;  // shoud have called it skip
            } else {
                System.out.println(i);
              //  System.out.println("hello java");
            }
           System.out.println("hello java");

        }
    }
}