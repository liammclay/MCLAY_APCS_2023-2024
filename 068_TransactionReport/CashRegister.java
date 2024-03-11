public class CashRegister {
    public Transaction[]  allTransactions(){
        Transaction candybar = new Transaction("Twix", "Delicous carmeland chocolate candy bar.", 0.30, 1.99);
        Transaction soda = new Transaction("Sprite", "Lemon and lime flavored soda.", 0.90, 2.99);
        Transaction batteries = new Transaction("AAA Batteries", "Duracell 10 pack.", 2.00, 9.99);
        
        Transaction[] totalTransactions = {candybar, soda, batteries};
        return totalTransactions;
    }
    public static void main(String[] args) {}
}
