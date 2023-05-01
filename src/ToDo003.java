public class ToDo003 {
//Write a method to return whether given number is prime or not?
    boolean checking(int a) {
        boolean isPrime = true;
        if(a<=1)
        {
            return false;
        }
        for (int i = 2; i <a/2 ; i++) {
            if(a%i==0){
            return false;
            }
        }return true;
        }

    public static void main(String[] args) {
        ToDo003 obj=new ToDo003();
        System.out.println(obj.checking(23));
    }
}








