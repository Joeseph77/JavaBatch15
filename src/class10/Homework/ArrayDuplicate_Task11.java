package class10.Homework;

import java.util.Arrays;

/*
1)Write a program to print out duplicate elements
from an Array of Strings?
 */
public class ArrayDuplicate_Task11 {
    public static void main(String[] args) {
        String[] cars = {"Mazda", "Toyota", "BMW", "BMW", "Toyota", "Honda", "kk"};
         int k = 0;
        String[] duplicate = new String[k];
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].equalsIgnoreCase(cars[j])) {
                    System.out.print(cars[i] + " ");
                }
            }
        }
    }
}

