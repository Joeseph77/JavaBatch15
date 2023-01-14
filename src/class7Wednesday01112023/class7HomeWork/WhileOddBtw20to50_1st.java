package class7Wednesday01112023.class7HomeWork;
//Print odd numbers between 20 and 50 (2 ways, 1st while)
public class WhileOddBtw20to50_1st {
    public static void main(String[] args) {
        int i = 20;
        while (i >= 20 && i < 50) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
