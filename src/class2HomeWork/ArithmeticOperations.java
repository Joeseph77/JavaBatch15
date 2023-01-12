package class2HomeWork;
public class ArithmeticOperations {
    public static void main(String[] args) {
        float num1 = 10.5f;
        float num2 = 10.5f;
        double numSquare = 3.9;

        System.out.println("The Addition of 2 numbers "+num1+" and "+num2+" is equal to "+(num1+num2));
        System.out.println("The Subtraction of 2 numbers "+num1+" and "+num2+" is equal to "+(num1-num2));
        System.out.println("The Multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+(num1*num2));
        System.out.println("The Division of 2 numbers "+num1+" and "+num2+" is equal to "+(num1/num2));
        System.out.println("The Square of "+numSquare+" is equal to "+(numSquare*numSquare));
        System.out.println("The Square of "+numSquare+" 'using to the power' is equal to "+(Math.pow(numSquare,2)));

    }
}
