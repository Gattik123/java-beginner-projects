import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name of Player 1: ");
        String p1 = scan.nextLine();
        System.out.print("Enter Name of Player 2: ");
        String p2 = scan.nextLine();
        Player player1 = new Player(p1, 'X');
        Player player2 = new Player(p2, 'O');
        Board board = new Board(player1,player2);
        Game newGame = new Game(player1,player2);
        newGame.start();
    }
}
