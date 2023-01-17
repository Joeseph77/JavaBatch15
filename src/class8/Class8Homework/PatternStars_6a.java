package class8.Class8Homework;

/*
6) Print the following pattern: (( Samuel Houston ))
*

*

*
**
*
**
*
 */
public class PatternStars_6a {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println("*");
            } else if (i == 2 || i == 4) {
                System.out.println();
            } else {
                System.out.println("**");
            }
        }
    }
}
