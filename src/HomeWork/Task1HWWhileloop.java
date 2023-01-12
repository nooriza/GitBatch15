package HomeWork;

public class Task1HWWhileloop {
    public static void main(String[] args) {
        /* Create a boolean variable workday and assign true crate int
        variable day and assign it to 1
        as long as it is workday print "I need a day off" and increase day.
        Once day is 6 print "I don't need a day off anymore"
         */
        boolean workDay=true;
        int day=1;
        while (workDay){
            if(day<=5){
                System.out.println("I need a day off");
            }else{
                System.out.println("I do not need a day off tomorrow");
                workDay=false;
            }
            day++; //it is eqaul to day=day+1 day+1
        }
    }

}
