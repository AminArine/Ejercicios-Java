public class BankAccount {
    double balance;
    double deposito;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double deposito) {
        this.balance += deposito;
        System.out.println("Su saldo es de : " + this.balance);
    }
}