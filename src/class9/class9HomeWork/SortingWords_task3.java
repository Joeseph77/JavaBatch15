package class9.class9HomeWork;
/*
3)Create an array of words:Java,Saturday,day,coding,is.
Print the following sentence using elements of array: “Saturday is Java coding Day”.
*/
public class SortingWords_task3 {
    public static void main(String[] args) {
        String[] jWords = {"Java", "Saturday", "day", "coding", "is"};
        System.out.print(jWords[1] + " " + jWords[4] + " " + jWords[0] + " " + jWords[3] +" "+jWords[2]);
    }
}