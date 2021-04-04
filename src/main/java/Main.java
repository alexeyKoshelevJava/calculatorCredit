public class Main {
    public static void main(String[] args) {
        CreditCalculator cr = new CreditCalculator(100000,1);
        System.out.println(cr.monthlyPayment());
        System.out.println( cr.overPayment());
        System.out.println(cr.totalAmount());
    }
}
