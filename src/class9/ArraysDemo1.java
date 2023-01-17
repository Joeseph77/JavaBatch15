package class9;

public class ArraysDemo1 {
    public static void main(String[] args) {
        String [] names={"Slava","Safi","jason","Nabil","Anees","Joseph"};
        System.out.println(names);
        for (int i=0; i<=5;i++){
            System.out.print(names[i]+" ,");
        }
        for (int i=0; i< names.length;i++){
            for (int j=0; j<2; j++) {
                System.out.println();
            }
            System.out.print(names[i]+" ,");
        }
    }
}