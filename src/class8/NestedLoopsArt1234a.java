package class8;

public class NestedLoopsArt1234a {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i+=2) {  //outer loop

            for (int j = i+2; j <= 10; j++) { //inner loop
                System.out.print(j + " ");

                // System.out.println("");
                // System.out.println("i = "+i+" j = "+j);
            }
            System.out.println("");
        }

    }
}