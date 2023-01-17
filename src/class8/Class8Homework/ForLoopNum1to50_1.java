package class8.Class8Homework;
/*
1) Print numbers from 1 to 50 except those that are divisible by 3
 */
public class ForLoopNum1to50_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
