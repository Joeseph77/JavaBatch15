package class9.class9HomeWork;
/*2) C Create an array of names and store all names of your group.
Then print your name from that array. (use 2 different ways of creating an array).
*/
public class StringArrayGroup_task2 {
    public static void main(String[] args) {
        String[] groupNames = {"Joseph","Diego", "Andrea", "Daniela", "Francisco", "Ja'Quan", "Kateryna","Lhabib","Mineur","Myakola"};
        for (int i = 0; i < groupNames.length; i++) {
            System.out.print(groupNames[i] +", ");
        }
    }
}