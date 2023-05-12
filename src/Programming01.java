public class Programming01 {
   // Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
static void printInfo(){
    System.out.println("Hi World");
}
Programming01(String i){
    System.out.println("Hi "+ i);

}
Programming01(int i,int a){
    System.out.println("The total is :"+(i+a));
}
Programming01(String i,int b){
    System.out.println(i+b);
}

    public static void main(String[] args) {
        Programming01.printInfo();
       Programming01 obj=new Programming01("Hello-----------");
        Programming01 obj1=new Programming01(5,50);

    }
}
