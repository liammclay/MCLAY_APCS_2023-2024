public class UserAccount {
    public static void main(String[] args) {
        BankData foo = new BankData();
        BankAccount one = new BankAccount("Liam", "checkings", 100.00, foo.checkingInterestRate, foo.savingsInterestRate);
        

        one.updateBalance(50.00);
        one.updateBalance(-75.00);
        one.applyInterest();
        one.updateBalance(-90.00);


    }
}
// made an object from bank data and bank account.  used methods to update balance.

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/