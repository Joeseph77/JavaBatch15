package class9.class9HomeWork;

/*
6) Create an array of countries. While retrieving all values from an array print capital for each country choose any five countries.
 */
public class StringArrayCountries_task6 {
    public static void main(String[] args) {
        String[] country = new String[5];
        country[0] = "USA";
        country[1] = "Italy";
        country[2] = "France";
        country[3] = "India";
        country[4] = "Pakistan";
        String[] capital = {"Washington DC", "Rome", "Paris", "New Delhi", "Islamabad"};
        for (int i=0; i<country.length;i++) {
            for (int j=0; j<capital.length; j++) {
                while (i==j) {
                    System.out.println(capital[j]+" is the capital of "+country[i]);
                    break;
                }
            }
        }

    }
}
