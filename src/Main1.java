public class Main1 {
    public String alphabetical(String str) {
        String result = "";
        char previousChar = 'a';
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar > previousChar) {
                result += currentChar;

            }
            previousChar = currentChar;
        }
        return result;
    }

    public static void main(String[] args) {
       Main1 obj=new Main1();
        System.out.println(obj.alphabetical("Hello"));
        System.out.println(obj.alphabetical("software"));
        System.out.println(obj.alphabetical("language"));

    }
}




