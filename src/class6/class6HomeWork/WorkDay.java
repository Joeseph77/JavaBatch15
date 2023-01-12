package class6.class6HomeWork;

public class WorkDay {
    public static void main(String[] args) {
        boolean workDay = true;
        int day = 1;

        while (workDay) {
            System.out.println(" I need a day off");
            if (day + 1 < 6) {
            } else {
                workDay = false;
            }
            day++;
        }
        System.out.println(day);
        System.out.println(" I don't need a day off any more");
    }

}
