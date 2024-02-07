public class BankAccount {
    String userName;
    String accountType;
    double currentBalance;
    double interestRate;
    Boolean isOverdrafted;
    

    public BankAccount(String userName, String accountType, double currentBalance, double checkingInterestRate, double savingsInterestRate){
        this.userName = userName;
        this.accountType = accountType;
        this.currentBalance = currentBalance;
        


        if(currentBalance <= 0.0){
            isOverdrafted = true;
        }
        else{
            isOverdrafted = false;
        }

        if (accountType.equals("checkings")){
            interestRate = checkingInterestRate;
        }
        else{
            interestRate = savingsInterestRate;
        }
    }

    public void checkBalance(){
        System.out.println(userName+", your balance is $"+currentBalance+".");
    }
    
    public void updateBalance(double update){
        this.currentBalance = currentBalance+update;
        System.out.println("Your balance is updated to, ($"+currentBalance+").");
        if(currentBalance <= 0.0){
            isOverdrafted = true;
        }
        else if(currentBalance >= 0.0){
            isOverdrafted = false;
        }
        if(isOverdrafted = true){
            System.out.println("Warning! your account is Overdrafted.");
        }
    }
    
    public void applyInterest(){
        
        System.out.println(userName+", your interest rate is applied, and your balance has been updated.");
        currentBalance = currentBalance*interestRate*0.01+currentBalance;
        System.out.println("($"+currentBalance+")");
    }
    
    public void updateOverdraft(){
        if(currentBalance >= 0.0){
            System.out.println(userName+", you are not overdrafted, your balance is "+currentBalance+".");
        }
        else{
            System.out.println(userName+", you are overdrafted, your balance is "+currentBalance+".");
        }
    }
    public static void main(String[] args) {
        
    }
}
//made class variables, and made methods that use them to give bankinh information.