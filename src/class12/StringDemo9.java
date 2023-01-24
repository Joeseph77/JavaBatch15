package class12;

public class StringDemo9 {
    public static void main(String[] args) {
        String str = "jdnkdfas 56554123564558 !#^%$#@#@";
        int countLetter = 0;
        int countDigit = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                countLetter++;
            }
            if (Character.isDigit(str.charAt(i))) {
                countDigit++;
            }

        }
        System.out.println("Total is Alphabetic in Str " + countLetter);
        System.out.println("Total is digits in Str " + countDigit);
    }
}