package ZJavaQuiz_2LoopsAndArrays;

public class Quiz2 {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40}, {5, 10, 15}};
        int sum = 0;
        for (int[] x : arr) {
            for (int j : x) {
                for (int i = 0; i < x.length; i++) {
                    sum += j;

                    System.out.print(x[i] + " ");
                }

            }

        }
    }
}
