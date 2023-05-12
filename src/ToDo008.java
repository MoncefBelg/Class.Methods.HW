public class ToDo008 {
    /*Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 -
    from different class inside different package  and observe result.*/
    String name;
    String lastNAme;
    int age;
    char degree;
    ToDo008(){
        System.out.println("================?????");
    }

protected ToDo008(String name,String lastNAme,int age){
    this.name=name;
    this.lastNAme=lastNAme;
    this.age=age;
    System.out.println("Heeeeeeeeeeeey");
}
    private ToDo008(String name,String lastNAme,int age,char degree){
        System.out.println("my full name is "+name+" "+lastNAme+" ." +"I am "+age+" ."+"I got "+degree+" degree.");
    }
    protected ToDo008(String lastNAme,char degree){
        System.out.println("my name is "+lastNAme+" I got "+degree+" degree.");

    }

    public static void main(String[] args) {
       ToDo008 ToDo0081= new ToDo008();
        ToDo008 ToDo0082= new ToDo008("Moncef",'B');
        ToDo008 ToDo0083= new ToDo008("Moncef","Belgas",27,'C');
        ToDo008 ToDo0084= new ToDo008("Amine","Cherif",20);



    }
}
