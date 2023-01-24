package class11.HomeWork;
/*
 Create a 2D array(shorter way) in which first array will consist
 of 4 names and second array will contain grades. Then your program should
 print name of the students that has A
 */
public class Array2DGrades_Task1 {
    public static void main(String[] args) {
        String[][] grades = {{"Joseph", "Sam", "John", "Peter"}, {"A", "D", "B", "C"}};
        for (int i = 0; i < grades[1].length; i++) {
            if (grades[1][i].equals("A")||grades[1][i].equals("B")) {
                System.out.print(grades[0][i]+", ");
            }
        }
    }
}
