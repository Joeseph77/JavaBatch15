package class12;

public class StringDemo8 {
    public static void main(String[] args) {
        /*String str="Java is love";
        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }*/

        String str="Java is love";
        int count=0;
        for (int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='a') {
            count++;
            }
           // System.out.print(str.charAt(i)+" ");
        }
        System.out.println(count);
    }
}
