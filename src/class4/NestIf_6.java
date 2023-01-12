package class4;

public class NestIf_6 {
    public static void main(String[] args) {
        int money = 1000;
        String day ="Sunday";
        boolean ture;
        boolean mood = true;
        if (money>700){
            if (mood){
                System.out.println("Let's go shopping");
            } else {
                System.out.println("mood is false");
            }
        } else {

            System.out.println("Let's first save some money");
        }
    }



}
