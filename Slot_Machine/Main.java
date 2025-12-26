import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Slot Machine!");
        
        String rules = """
        1. You would place a bet amount.
        2. The slot machine would then run and provide 3 numbers.
        3. If all 3 numbers are same then, You would recieve 100 times your bet amount.
        4. If any 2 numbers are same your would recieve 10 times your bet amount.
        5. Bet cant be negative or more than your balance amount.
        6. Each number would be anywhere between 1 and 9.
        """;

        System.out.println(rules);
        System.out.print("Press [ENTER] to continue");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        int balance;
        int bet;

        while(true){
            System.out.print("Enter Your Balance amount: ");
            balance = scan.nextInt();
            if(balance<=0){
                System.out.println("Balance should be greater than 0");
            }
            else break;
        }

        while(true){
            while(true){
                System.out.print("Enter Your Bet amount: ");
                bet = scan.nextInt();
                if(bet<0){
                    System.out.println("Bet cant be negative!");
                }
                else if(bet>balance){
                    System.out.println("Bet should be less than or equal to your balance amount!");
                }
                else break;
            }
            scan.nextLine();
            balance -=bet;

            int output[] = spin();
            System.out.print("\n****************\n****************");
            System.out.print("\nOutputs: ");
            int count;
            for(int num:output){
                System.out.print(num+"  ");
            }
            System.out.print("\n****************\n****************");
            if(output[0]==output[1]&&output[0]==output[2])count=3;
            else if(output[0]==output[1]||output[1]==output[2]||output[0]==output[2])count=2;
            else count=1;
            int reward;
            switch(count){
                
                case 2:reward =bet*10;break;
                case 3:reward = bet*100;break;
                default:reward =0;
            }
            balance+= reward;
            System.out.println("\n\nYou got "+count+" equal numbers so your reward is "+reward);
            System.out.println("Your new balance is "+balance);
            System.out.println("Hit [ENTER] to continue playing, Else Press Any key and hit [ENTER]");
            
            String input = scan.nextLine();
            char next = (input.isEmpty())?' ':input.charAt(0);
            if(next !=' ')break;
        }
        scan.close();
    }

    static int[] spin(){
        Random random = new Random();
        int[] arr = {0,0,0};
        for(int i=0;i<3;i++){
            arr[i] = random.nextInt(9)+1;
        }
        return arr;

        
    }
}
