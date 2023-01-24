package class10;

public class class10 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        for (int x : arr) {
            System.out.println(x);
        }
        int[] arr1 = {10, 13, 20, 30, 40, 50};
        for (int x1 : arr1) {
            if (x1 % 2 != 0) {
                System.out.println(x1);
            }

        }
        System.out.println("*****");
        int[] arr2 = {10, 13, 20, 25, 45, 50};
        for (int m : arr2) {
            if (m % 2 != 0) {
                System.out.println(m);
                arr2[m]=0;
            }
        }
        //for (int i : arr2) {
         //   System.out.println(i);

        //}
    }
}