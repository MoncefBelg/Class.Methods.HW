public class ToDo001 {
    /*Create a method that will say Hello in different language based on the country that will passed when method is executed.*/
     String language(String country){ //String ==>>return type
         System.out.println("Please Enter a Language??????");

         if(country.equalsIgnoreCase("UK")){
             System.out.println("Hello");
         }else if (country.equalsIgnoreCase("France")){
             System.out.println("Bonjour");
         }else if (country.equalsIgnoreCase("Morocco")){
             System.out.println("Salam Alaykom");
         }else if (country.equalsIgnoreCase("Spain")){
             System.out.println("Hola!");
         }else {
             System.out.println("Try Again--------------");
         }
         return country;
     }

    public static void main(String[] args) {
        ToDo001 obj=new ToDo001();   //creating object
        String country="spaIn";
        String test=obj.language(country); //calling the Method
    }
}
