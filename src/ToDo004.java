public class ToDo004 {
    /*Create  class Student that will have a method getGrade.
    Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F */

    char method(int score)
    {
       char getGrade=' ' ;
       if(score>90)
       {
           System.out.println("Student Grade is : A");
       }
       else if (score>80)
       {
           System.out.println("Student Grade is : B");
       }
       else if (score>70)
       {
           System.out.println("Student Grade is : C");
       }
       else if (score>50)
       {
           System.out.println("Student Grade is : D");
       }
       else {
           System.out.println("Student Grade is : F");
       }
       return getGrade;
    }



    public static void main(String[] args) {
        ToDo004 obj=new ToDo004();
        System.out.println(obj.method(85));
    }
}







