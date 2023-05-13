import java.lang.reflect.GenericArrayType;

public class Computer {
    /*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.*/

    String model;
    int Ram;
    String display;
    int Gen;

    public Computer(String model, int ram, String display, int gen) {
        this.model = model;
        this.Ram=Ram;
        this.display = display;
        this.Gen = Gen;
    }

    void loading(){
        System.out.println("Wait a minute");
    }
    void download(){
        System.out.println("downloading is pending");
    }
}
class Apple extends Computer{

    public Apple(String model, int RAM, String display, int Gen) {
        super(model, RAM, display, Gen);
    }

    @Override
void loading(){
        System.out.println("Hold on a minute");
    }
    @Override
    void download(){
        System.out.println("en cours");
    }
    void ShutDown(){
        System.out.println("Your computer is too hot , it will automatically Powered off");
    }

}
class Lenovo extends Computer{
    public Lenovo(String model, int RAM, String display, int Gen) {
        super(model, RAM, display, Gen);
    }

    @Override
    void loading(){
        System.out.println("be patience please");
    }
    @Override
    void download(){
        System.out.println("it's in process");
    }

}
class HP extends Computer{
    public HP(String model, int RAM, String display, int Gen){
       super (model,RAM,display,Gen);
    }
    @Override
    void loading(){
        System.out.println(" patience..... ");
    }
    @Override
    void download(){
        System.out.println("processing ......");
    }

}
class Dell extends Computer{

    public Dell(String model, int ram, String display, int gen) {
        super(model, ram, display, gen);
    }
    @Override
    void loading(){
        System.out.println("System processing");
    }
    @Override
    void download(){
        System.out.println("Downloading.....");
    }
}