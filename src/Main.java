public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(20000);
        while (true) {
            try {
                bankAccount.withDraw(6000);
                System.out.println("Вы сняли 6000 сом. Осталось денег: " + bankAccount.getAmount() + " сом");
            } catch (LimitException у) {
                System.out.println("Недостаточно средств на счете. Осталось денег: " + у.getRemainingAmount() + " сом");
                try {
                    bankAccount.withDraw(у.getRemainingAmount());
                    System.out.println("Снято оставшееся на счете: " + у.getRemainingAmount() + " сом");
                } catch (LimitException ex) {
                    System.out.println("Произошла ошибка при снятии денег: " + ex.getMessage());
                }
                break;
            }
        }
    }
}



