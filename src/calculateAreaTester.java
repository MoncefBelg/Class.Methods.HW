public class calculateAreaTester {
    public static void main(String[] args) {
       calculateArea square= new calculateArea();
      double squareCalculation=square.squareArea(13.5);
        System.out.println(squareCalculation);

         double rectangleCalculation=square.rectangleArea(12,30.6);
        System.out.println(rectangleCalculation);
    }
}
