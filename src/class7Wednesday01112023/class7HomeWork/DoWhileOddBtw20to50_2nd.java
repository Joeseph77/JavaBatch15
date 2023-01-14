package class7Wednesday01112023.class7HomeWork;

//Print odd numbers between 20 and 50 (2 ways, 2nd do while)
public class DoWhileOddBtw20to50_2nd {
    public static void main(String[] args) {
        int i = 20;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i < 50);
    }
}
