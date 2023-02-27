package Class15;

public class TaskEmail {

    /*
    Create a method createEmail(). Based on values of user name, last name and email type,
    your
     */

    //Return Type String
    //Parameter=>String First Name, String Last name, String Emailtype

String CreateEmail(String Firstname, String Lastname, String EmailType){
    return Firstname+Lastname+EmailType;
}
    public static void main(String[] args) {
        TaskEmail email=new TaskEmail();
        System.out.println(email.CreateEmail("John","Snow","@gmail.com"));
    }
}


