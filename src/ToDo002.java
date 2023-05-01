import java.util.Scanner;

public class ToDo002 {
   /*Create a method createEmail(). Based on values of users firstName, lastName and email type, your method
   should return complete email AddressExample:  createEmail(John, Snow, gmail) → johnsnow@gmail.com */
    String user(String firstName,String lastName,String emailType){

        String userLogin=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+emailType.toLowerCase()+".com";
        System.out.println(userLogin);
    return userLogin;
    }

    public static void main(String[] args) {
       ToDo002 obj=new ToDo002();
       String firstName="Moncef";
       String lastName="Belgas";
       String emailType="GMAIL";

       String call= obj.user(firstName,lastName,emailType);
    }




    }

