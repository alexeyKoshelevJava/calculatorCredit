public class CreditCalculator {
    private int amount;
    private int countYears;
    private int percent;

    public CreditCalculator(int amount, int countYears) {
        this.amount = amount;
        this.countYears = countYears;
        if (amount > 100000 && countYears > 10) {
            percent = 10;
        } else {
            percent = 20;
        }
    }

    public double monthlyPayment() {

        return (((amount / 100 * percent * countYears) + (amount)) / (countYears * 12));
    }

    public double overPayment() {
        return amount / 100 * percent * countYears;
    }
    public double totalAmount(){
        return  (amount / 100 * percent * countYears)+amount;
    }
}


