package class9;

/*
write a program that can tell us how many times the number 10.5 is present in the array
 */
public class ArraysDemo8_Task {
    public static void main(String[] args) {
        double[] arr = {10.5, 12.0, 45, 10.5, 23, 10.5};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                if (arr[i] == arr[j]) {
                    count++;
                    System.out.println(arr[i]);

                }

        }
        System.out.println(count);
    }
}