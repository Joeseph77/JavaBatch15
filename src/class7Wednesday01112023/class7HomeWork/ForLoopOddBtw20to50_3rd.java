package class7Wednesday01112023.class7HomeWork;
//Print odd numbers between 20 and 50 (2 ways, 3rd for Loop)
public class ForLoopOddBtw20to50_3rd {
    public static void main(String[] args) {
        for (int i = 20; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
