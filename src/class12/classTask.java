package class12;

/*
Store username, password and confirm password from a user and check following requirements:
Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.
Only after all requirements met → message “Your username and password has been created”
 */
public class classTask {
    public static void main(String[] args) {
        String userName = "LoveJava";
        String passWord = "Java*2023";
        String storedPassWord = "Java*2023";
        if (userName.isEmpty() || passWord.isEmpty()) {
            System.out.println("Username and Password cannot be empty");
        } else if (passWord.length() < 8) {
            System.out.println("Password is too short");
        } else if (userName.contains(passWord)) {
            System.out.println("Password cannot contain username");
        } else if (!(passWord.equals(storedPassWord))) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }

    }
}
