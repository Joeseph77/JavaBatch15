package class7Wednesday01112023.class7HomeWork;
//Print even numbers from 20 to 1 (2 ways) (2nd DoWhile)
public class DoWhileEven20to1_2nd {
    public static void main(String[] args) {
        int i1 = 20;
        do {
            if (i1 % 2 == 0) {
                System.out.println(i1);
            }
            i1--;

        } while (i1 > 0);

    }
}
