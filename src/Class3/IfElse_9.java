package Class3;

public class IfElse_9 {
    public static void main(String[] args) {
        char c ='M';

        if(c=='M') {

            System.out.println("it's a male");
        }

        String name = "Sam";
        if(name.equals("Sam")) {              //with non-primitive data type == does not work all the time, will use something different
                   System.out.println("Amazing Student");
                   }

        if(!name.equals("SaN")) {  //NOT EQUAL; with non-primitive data type == does not work all the time, will use something different

            System.out.println("Not an Amazing Student");
        }

    }
}
