package ZZJoePractice;

public class DataCasting {
    public static void main(String[] args) {
        byte smallNum = 110;
        short medNum = 4000;
        int  mostUsedNum = 5500;
        long hugeNumb = 987654321;
        float decimalNum = 15.3f;
        double  decDouble = 222.123456789;
        char    myChar = '$';
        boolean isRunning = true;

        byte a = (byte) mostUsedNum;  //5500 will be 124 "How??"
        System.out.println(smallNum);
        System.out.println(a);
        System.out.println(medNum);
        System.out.println(mostUsedNum);
        System.out.println(hugeNumb);
        System.out.println(decimalNum);
        System.out.println(decDouble);
        System.out.println(myChar);
        System.out.println(isRunning);
    }
}
