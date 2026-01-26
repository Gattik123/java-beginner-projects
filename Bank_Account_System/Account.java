public class Account{
    private long accountNumber;
    private String holderName;
    private int balance = 3000;

    Account(String holderName){
        this.accountNumber = AccountNumberGen.accountNumberGen();
        this.holderName=holderName;
        this.balance=balance;
    }

    // deposit
    public void deposit(int value){
        this.balance+=value;
    }
    // withdraw
    public void withdraw(int value){
        if(balance-value>=0)this.balance-=value;
        else System.out.println("Insufficient Funds");
    }
    // show balance
    
    // show holder details

}