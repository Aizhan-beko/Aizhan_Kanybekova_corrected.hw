public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(15000);
        System.out.println("Dear client, you have:" + account.getAmount());
        System.out.println();

        boolean isInfinite = true;
        try {
            while (true) {
                account.withdraw(6000);
                System.out.println("Balance has successfully withdrawn, remaining amount:" + account.getAmount() + " som");
            }
        } catch (LimitException e) {
            try {
                account.withdraw((e.getRemainingAmount()));
            } catch (LimitException e1) {
                {
                }
            }
            System.out.println("Exception: " + e.getMessage());
            System.out.println("You have:" + account.getAmount());

        }
    }
}