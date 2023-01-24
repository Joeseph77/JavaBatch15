package class11.HomeWork;
/*
Create a 2D array or integer type where you will store odd and even numbers
in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only
 */
public class Array2DEven_Task5 {
    public static void main(String[] args) {
        int[][] numbers = {{6, 9, 15, 8}, {5, 10, 15, 12}, {10, 20, 30}};
        int sum = 0;
        for (int[] x : numbers) {
            for (int s : x) {
                if (s % 2 == 0) {
                    System.out.print(s+", ");
                }
            }
        }
    }
}