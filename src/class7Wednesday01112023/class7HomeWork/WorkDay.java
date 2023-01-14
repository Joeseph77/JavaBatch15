package class7Wednesday01112023.class7HomeWork;
/*
Create a boolean variable workDay and assign true create int variable day and assign
it to 1 As long as it is workDay print “I need a day off” and increase day.
Once day is 6 print “I do not need a day off anymore”
 */


public class WorkDay {
    public static void main(String[] args) {
        boolean workDay = true;
        int day = 1;
        while (workDay) {
            System.out.println("I need a day off");
            if (day >= 5) {
                workDay = false;
                System.out.println("I don not a day off anymore");
            }
            day++;
        }
    }

}
