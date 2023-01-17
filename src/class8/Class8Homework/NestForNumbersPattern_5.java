package class8.Class8Homework;
/*
5) Print the following pattern:
55555
4444
333
22
1
 */
public class NestForNumbersPattern_5 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
