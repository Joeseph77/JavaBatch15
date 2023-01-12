package class2;

public class VariablesDemo2 {
    public static void main(String[] args) {

        int numberBox=10;  //we don't need to define the data types again, java remembers it.
        numberBox=20;  //instructed Java to replace 10 with 20 "overriding or re-assigning values
        numberBox=300;

        System.out.println(numberBox);
        System.out.println(numberBox*2);
        System.out.println(numberBox*3);
        System.out.println(numberBox*4);
    }
}
