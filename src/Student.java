public class Student {
    /*Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
     Test Student class for 5 different students with different marks.
      Your program should print an average mark of each student's name.*/

    String name;


    int grade;
    int grade1;
    int grade2;

    public Student(String name, int grade,int grade1,int grade2){
        this.name=name;

        this.grade=grade;
        this.grade1=grade1;
        this.grade2=grade2;
    }
    private int  average(){
      int   average= (grade+grade1+grade2)/3;
      return average;
    }

    public static void main(String[] args) {
       Student obj=new Student("Amine",75,60,90);
        System.out.println(obj.average());

       Student obj1=new Student("Moncef",60,60,90);
        System.out.println(obj1.average());

        Student obj2=new Student("Amina",75,50,80);
        System.out.println(obj2.average());

        Student obj3=new Student("Yassine",75,85,90);
        System.out.println(obj3.average());

        Student obj4=new Student("Mohammed",70,60,85);
        System.out.println(obj4.average());

    }
}
