public class ToDo005 {
    /*Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.*/
    public String reverse(String x)
    {

  StringBuilder rev  =new StringBuilder(x).reverse();
  return rev.toString();

    }

    public static void main(String[] args)
    {
     ToDo005 obj=   new ToDo005();
        System.out.println(obj.reverse("Morocco"));
    }
}