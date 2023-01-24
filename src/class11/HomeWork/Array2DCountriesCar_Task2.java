package class11.HomeWork;
/*
) Create 2D array of cars : american, german, korean, italian.
Then retrieve all values from that array using 2 different loops
 */
public class Array2DCountriesCar_Task2 {
    public static void main(String[] args) {
        String[][] cars = new String[4][4];
        String[] americanCars = {"Ford", "GMC", "Dodge", "Jeep"};
        String[] germanCars = {"Audi", "BMW", "Porsche", "Mercedes"};
        String[] koreanCars = {"Hyundai", "Ioniq", "Kia", "Genesis"};
        String[] italiananCars = {"Lamborghini", "Ferrari", "Maserati", "Fiat"};
        int counts=0;
        cars[0] = americanCars;
        cars[1] = germanCars;
        cars[2] = koreanCars;
        cars[3] = italiananCars;

        for (String[] x : cars) {
            for (String i : x) {
                System.out.print(i + " ");
                counts++;
            }
        }
        System.out.println("Total number of cars brands " +counts);
    }
}
