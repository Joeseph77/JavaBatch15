package class11;

import java.util.Arrays;

public class D2Arrary {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };
        System.out.println(matrix[2][4]);
        System.out.println(Arrays.toString(matrix[0]));
        for (int i=0; i< matrix[0].length;i++){
            System.out.println(matrix[0][i]);
        }
        int[] arr=matrix[0];//getting complete first array from 2d array
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("*******");
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix[i].length;j++) {
               // System.out.println(matrix[i][j]);
                if (matrix[i][j]%2!=0) {
                    System.out.println(matrix[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("==========");

        for(int x:matrix[0]) {
            System.out.println(x);
        }
        System.out.println("++++++++++");
        for (int[] arr1:matrix) {
            for(int number:arr1) {
                System.out.print(number+" ");

            }
            System.out.println("");
        }

    }
}
