public class ToDo007 {
  /*Create a method that will accept an array as parameters and will return a sum of all elements from
  * that array ,Method should be visibly only within same package and accessible by the creating
  an instance/object of the class */
  int sum(int [] num){
    int sum=0;
    for(int b:num){
      sum+=b;
    }return sum;
  }

  public static void main(String[] args) {
    ToDo007 obj = new ToDo007();
int total=obj.sum(new int[]{10,20,30});
    System.out.println(total);
  }
}