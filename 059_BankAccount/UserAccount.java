public class UserAccount {
    public static void main(String[] args) {
        BankData foo = new BankData();
        BankAccount one = new BankAccount("Liam", "checkings", 100.00, foo.checkingInterestRate(), foo.savingsInterestRate());
        

        one.updateBalance(50.00);
        one.updateBalance(-75.00);
        one.applyInterest();
        one.updateBalance(-90.00);


    }
}
