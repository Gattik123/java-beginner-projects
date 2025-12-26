import java.util.Scanner;
public class Main{
    
    static void showBalance(int accountNumber){
    }
    // static int withdraw(int accountNumber, int amount){
    // }
    // static int deposit(int accountNumber,int amount){
    // }
    static void exit(){
        System.out.println("Thank You For Visiting!");
    }
    
    public static void main(String[] args){
        int choice=0;
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.print("Welcome to Bank!\nWhats your Account Number? ");
            int accountNumber = scan.nextInt();
            scan.nextLine();
            System.out.println("Your Account Number is "+accountNumber);
            System.out.print("Yes/No - ");
            String choiceString = scan.nextLine();
            if(choiceString.equalsIgnoreCase("yes")){break;}
        }
        
        while(choice!=4){
            System.out.println("1.Check Balance");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposit");
            System.out.println("4.Exit");
            System.out.println("Your Choice:- ");
            choice = 4;
        }

        scan.close();
    }
}