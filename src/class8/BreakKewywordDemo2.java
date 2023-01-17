package class8;

public class BreakKewywordDemo2 {
    public static void main(String[] args) {
        boolean summer = true;
        int temp=75;
        while (summer) {
            if(temp<=100) {
                System.out.println("I love summer");
            } else {
                summer=false;
                System.out.println("It's very hot");
               // break;
            }
            temp+=5;
        }





    }
}
