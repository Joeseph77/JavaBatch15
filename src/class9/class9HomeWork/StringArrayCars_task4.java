package class9.class9HomeWork;
/*
4) Create an array that can store names of cars and store 6 elements into it. Print all values from the array.
 */
public class StringArrayCars_task4 {
    public static void main(String[] args) {
        String[] cars = new String[6];
        cars[0]="BMW";
        cars[1]="Tesla";
        cars[2]="Lucid";
        cars[3]="Honda";
        cars[4]="Toyota";
        cars[5]="WV";

        for (int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
