package class11.HomeWork;
import java.util.Arrays;
/*
3) Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
 Retrieve all values from that array using 2 different loops
 */
public class Array2DGroceryList_Task3 {
    public static void main(String[] args) {
        String [][] groceries = {{"Spinach","Broccoli","Lettuce"},
                {"Apple","Banana","Orange"},
                {"Milk","yogurt","Swiss Cheese"},
                {"Cake","Ice Cream","Chocolate","Cookies"}};
        for (int i=0;i<groceries.length; i++) {
            System.out.print(Arrays.toString(groceries[i]));
            System.out.println();
        }
        /* for (int i=0; i< groceries.length; i++) {
            for (int j=0; j<groceries[i].length; j++) {
                System.out.print(groceries[i][j]+" ");
            }
            System.out.println();
        }*/
            for (String[] x:groceries) {
                for (String s:x) {
                    System.out.print(s+" ");
                }
                System.out.println();
            }
        }
    }



