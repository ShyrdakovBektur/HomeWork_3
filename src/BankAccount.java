public class BankAccount {

    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public double getAmount() {
        return amount;
    }

    public void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Вы проситье больше деньег чем, у вас имеется!",amount);
        }
        amount -= sum;
    }
}
