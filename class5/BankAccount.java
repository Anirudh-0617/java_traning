package class5;
public class BankAccount {
    private double balance=10000;

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
            acc1.withdraw(3000);
            acc1.withdraw(8000);
        }
         class TransactionValidator  {
            boolean canwithdraw (double amt) {
                return amt <= balance;
            }

        }
        private void withdraw(double amt) {
            TransactionValidator validator = new TransactionValidator();
            if (validator.canwithdraw(amt)) {
                balance -= amt;
                System.out.println("Withdrawal of " + amt + " successful. Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient funds for withdrawal of " + amt + ". Current balance: " + balance);
            }
    }

}