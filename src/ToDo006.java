public class ToDo006 {
  /*Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
  Method should be available inside the class only where it was declared and executed by calling it is name*/
  private String speccialCharacter(String s)
  {
    StringBuilder sb = new StringBuilder();
    s = s.toLowerCase();
    for (int i = 0; i < s.length(); i++)
    {
      if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
        sb.append(s.charAt(i));
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    ToDo006 name=new ToDo006();
    System.out.println(name.speccialCharacter("Moncef"));
  }
}