class BankAccount {
    private String holderName;
    private double balance;

    public BankAccount(String holderName, double balance) {
        this.holderName = holderName;

        if (balance >= 500) {
            this.balance = balance;
        } else {
            this.balance = 500;
        }
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 500) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Withdrawal Failed");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Janani", 10000);

        System.out.println("Holder: " + acc.getHolderName());
        System.out.println("Balance: Rs." + acc.getBalance());

        acc.deposit(2000);
        acc.withdraw(3000);

        System.out.println("Final Balance: Rs." + acc.getBalance());
    }
}