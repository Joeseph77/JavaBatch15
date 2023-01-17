package class9.class9HomeWork;

/*2) C Create an array of names and store all names of your group.
Then print your name from that array. (use 2 different ways of creating an array).
*/
public class StringArrayGroup_task2a {
    public static void main(String[] args) {
        String[] groupNames = new String[10];
        groupNames[0] = "Joseph";
        groupNames[1] = "Diego";
        groupNames[2] = "Andrea";
        groupNames[3] = "Daniela";
        groupNames[4] = "Francisco";
        groupNames[5] = "Ja'Quan";
        groupNames[6] = "Kateryna";
        groupNames[7] = "Lhabib";
        groupNames[8] = "Mineur";
        groupNames[9] = "Myakola";

        for (int i = 0; i < groupNames.length; i++) {
            System.out.print(groupNames[i] + ", ");
        }
    }
}