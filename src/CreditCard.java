public class CreditCard {
    /*Create a class CreditCard and define variable balance and interest.
        Create an instance method that will calculate interest based on the given balance.
         Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
          Call the method by creating an object of each of the three classes.*/
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    void interestCalculation(){
        System.out.println("Interest rate is : "+balance*(interest/100));
    }
}
class Visa extends CreditCard{
    public Visa(double balance ,double interest){
        super(balance, interest);
    }

}
class AX extends CreditCard{
    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void interestCalculation(){
        System.out.println("Interest rate is : "+balance*(interest/100));
    }

    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(5000,2.5);
        creditCard.interestCalculation();

    }
}


