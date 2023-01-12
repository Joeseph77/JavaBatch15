package Class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number =125;
        number=(byte) number;
        byte number1 = (byte) number;
        /* if a developer wrote the data in a different type and I need to combine or match it with my code
        sometimes I have to convert the code or change the data type to match.
         */
        float f=10.5f;
        int num = (int)f;
        System.out.println(number);
        System.out.println(number1);
        System.out.println(num);
        float ff=11.55f;   ff = (int)ff;
        System.out.println(ff);

    }
}

