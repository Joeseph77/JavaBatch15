package class8;

public class NestedLoopsArt1234aa {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {  //outer loop

            for (int j = 0; j <= 5; j++) { //inner loop
                System.out.print(j * i + " ");
                // System.out.println("");
                // System.out.println("i = "+i+" j = "+j);
            }
            System.out.println("");
        }
    }
}
