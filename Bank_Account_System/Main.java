import java.util.*;
public class Main{
    public static Scanner scan = new Scanner(System.in);
    public static HashMap <Long,Account> accounts = new HashMap<>();
    public static void main(String[] args){
        
        int choice=0;
        while(choice!=6){
            System.out.println("Welcome!!!");
            System.out.println("How can we help you?\n1.Create Account\t2.Withdraw\n3.Deposit\t4.View Balance\n5.View Acc Detail\t6.Exit");
            choice=scan.nextInt();
            switch(choice){
                case 1:
                    Account.createAccount();
                    break;
                case 2:
                    Account.withdraw();
                    break;
                case 3:
                    Account.deposit();
                    break;
                case 4:
                    Account.showBalance();
                    break;
                case 5:
                    Account.showDetails();
                    break;
                case 6:
                    System.out.println("Thanks for visiting us!");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}