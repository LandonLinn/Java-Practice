
public class BankAccount {
    private String owner;
    private double balance;
    private int accountNumber;

    public BankAccount(String owner, double balance, int accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // Deposit
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Withdraw
    public void withdraw(double amount) {
        // Guard
        if (amount > balance) {
            System.out.println("Insufficient Funds");
            return;
        }
        balance -= amount;

    }

    // Getter for Balance
    public double getBalance() {
        return this.balance;
    }

    // toString to display all
    @Override
    public String toString() {
        return owner + ", Balance: " + balance + ", Account Number: " + accountNumber;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Landon", 100000, 0001);

        account.deposit(200000);
        System.out.println("After deposit: " + account.getBalance());
        account.withdraw(50000);
        System.out.println("After withdraw: " + account.getBalance());

        account.withdraw(9000000);
    }
}
