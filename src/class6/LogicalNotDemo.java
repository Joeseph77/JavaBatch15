package class6;

public class LogicalNotDemo {
    public static void main(String[] args) {
        System.out.println(false);
        System.out.println(!false);
        boolean condition=!true;
        System.out.println(condition);

        String password="Pass123";
        System.out.println(password.equals("Pass123"));
        if(!password.equals("Pass123")) {
            System.out.println("password is Wrong Password");
        }
        String password2="Pass1235";
        System.out.println(password2.equals("Pass123"));
        if(!password2.equals("Pass123")) {
            System.out.println("password2 is Wrong Password");
        }


    }
}
