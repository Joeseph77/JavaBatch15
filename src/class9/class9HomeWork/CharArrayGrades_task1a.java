package class9.class9HomeWork;
/*1) Create an array of chars and store grades into it: A,B,C,D,E,F.
Then print a grade B (use 2 different ways of creating an array).
*/
public class CharArrayGrades_task1a {
    public static void main(String[] args) {
        char[] letters = new char[6];
        letters[0] = 'A';
        letters[1] = 'B';
        letters[2] = 'C';
        letters[3] = 'D';
        letters[4] = 'E';
        letters[5] = 'F';
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + ", ");
        }
    }
}