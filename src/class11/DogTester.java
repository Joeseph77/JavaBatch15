package class11;

import java.util.Scanner;

public class DogTester {
  public static void main(String[] args) {


    // in real life, only one class will have the main method
    // only one main to tell Java where is the starting point, more than one will confuse Java
    //The below is creating an actual object from the class Scanner
    Scanner scanner = new Scanner(System.in); // imported because not in the same package

    Dog dog1 = new Dog();  //new a keyword to create a new class //no import because both are in the same clas11
    dog1.sleep();

  }
}