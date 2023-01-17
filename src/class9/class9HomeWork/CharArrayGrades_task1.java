package class9.class9HomeWork;
/*1) Create an array of chars and store grades into it: A,B,C,D,E,F.
hen print a grade B (use 2 different ways of creating an array).
*/
public class CharArrayGrades_task1 {
    public static void main(String[] args) {
        char[] letters = {'A', 'B', 'C', 'F', 'E', 'F'};
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] +", ");
        }
    }
}