package ZJavaProject;
public class NestedIF_b {
    public static void main(String[] args) {
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_GREEN="\u001B[32m";
        final String ANSI_PURPLE = "\u001B[35m";
        int num = 15;
        if (num > 5) ;
        if (num % 5 == 0) {  //The first contidion has to be true before checking 2nd. one
            System.out.println(ANSI_GREEN+"Number is greater than 5 and divisible by 5");

        } else {
            System.out.println(ANSI_PURPLE+"Number is greater than 5 but not divisible by 5");
        }

    }
}