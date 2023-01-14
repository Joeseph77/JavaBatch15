package class7Wednesday01112023.class7HomeWork;
//Print even numbers from 20 to 1 (2 ways) (1st While)
public class WhileEven20to1_1st {
    public static void main(String[] args) {
        int i = 20;
        while (i > 0) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}

