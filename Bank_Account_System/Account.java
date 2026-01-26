public class Account{
    private long accountNumber;
    private String holderName;
    private int balance = 3000;

    public Account(long accountNumber,String holderName){
        this.accountNumber = accountNumber;
        this.holderName=holderName;
        this.balance=3000;
    }

    // Create Account
    public static void createAccount(){
        long accountNumber = AccountNumberGen.accountNumberGen();
        Main.scan.nextLine();
        String name = Main.scan.nextLine();
        Account acc = new Account(accountNumber,name);
        Main.accounts.put(accountNumber,acc);
    }

    // deposit
    public static void deposit(){
        System.out.print("Account Number:- ");
        long accno=Main.scan.nextLong();
        Account acc = Main.accounts.get(accno);
        if (acc == null) {
            System.out.println("Account not found\n");
            return;
        }
        System.out.print("How much?");
        int value = Main.scan.nextInt();
        acc.balance+=value;
    }
    // withdraw
    public static void withdraw(){
        System.out.print("Account Number:- ");
        long accno=Main.scan.nextLong();
        Account acc = Main.accounts.get(accno);
        if (acc == null) {
            System.out.println("Account not found\n");
            return;
        }
        System.out.print("How much?");
        int value = Main.scan.nextInt();
        if(acc.balance>=value){acc.balance-=value;System.out.println("Done!!\n");}
        else System.out.println("Insufficient Funds\n");
    }
    // show balance
    public static void showBalance(){
        System.out.print("Account Number:- ");
        long accno=Main.scan.nextLong();
        Account acc = Main.accounts.get(accno);
        if (acc == null) {
            System.out.println("Account not found\n");
            return;
        }
        System.out.println("*********\n*********\nBalance:"+acc.balance+"\n*********\n********\n");
    }
    // show holder details
    public static void showDetails(){
        System.out.print("Account Number:- ");
        long accno=Main.scan.nextLong();
        Account acc = Main.accounts.get(accno);
        if (acc == null) {
            System.out.println("Account not found\n");
            return;
        }
        System.out.println("*********\nName:- "+acc.holderName+"\nAcc No:- "+acc.accountNumber+"\n*********\n");
    }
}