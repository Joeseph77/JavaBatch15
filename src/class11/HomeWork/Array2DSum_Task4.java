package class11.HomeWork;

/*
Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
Print the sum of all numbers.
 */
public class Array2DSum_Task4 {
    public static void main(String[] args) {
        int[][] numbers = {{6, 9, 15}, {5, 10, 15}, {10, 20, 30}};
        int sum = 0;
        for (int[] x : numbers) {
            for (int s : x) {
                sum += s;
            }
        }
        System.out.println(sum);
    }
}