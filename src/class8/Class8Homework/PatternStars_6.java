package class8.Class8Homework;

/*
6) Print the following pattern:
*

*

*
**
*
**
*
 */
public class PatternStars_6 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i <= 5) {
                if (i % 2 != 0) {
                    System.out.println("*");
                } else {
                    System.out.println();
                }
            } if (i>5) {
                if (i%2==0) {
                    System.out.println("**");
                } else {
                    System.out.println("*");
                }
            }
        }
    }
}