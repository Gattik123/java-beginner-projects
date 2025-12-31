import java.util.Scanner;
public class Game{
    private Player player1;
    private Player player2;
    private Board board;
    private Player currentPlayer;
    private Scanner scan;
    Game(Player player1,Player player2){
        this.player1 =player1;
        this.player2 = player2;
        this.board = new Board(player1,player2);
        this.currentPlayer = player1;
        this.scan = new Scanner(System.in);
    }
    public void start(){
        int index;
        int flag=0;
        while(flag!=1){
            board.print();
            System.out.println(currentPlayer.getName()+", Your move(Type an index 1-9):  ");
            index = askForMove()-1;
            while(!board.placeMark(index,currentPlayer.getMarker())){
                board.print();
                System.out.print("Enter a Valid Position!");
                index = scan.nextInt()-1;
            }
            board.print();
            if(board.getWinner()!=' '){
                System.out.println("Congrats "+currentPlayer.getName()+" is the Winner in "+board.getCount()+" steps!");
                flag =1;
            }
            switchPlayer();
            if(board.isFull()&&board.getWinner()==' '){
                System.out.println("Its a Draw! No Winners");
                flag=1;
            }
            if(flag==1){
                System.out.print("Restart?(Y/N): ");
                scan.nextLine();
                char s = scan.nextLine().charAt(0);
                flag = (s=='n'||s=='N')?1:0;
                if(flag!=1){
                    reset();
                }
            }
            
        }
    }

    private void switchPlayer(){
        currentPlayer = (currentPlayer==player1)?player2:player1;
    }
    private int askForMove(){
        int i = scan.nextInt();
        return i;
    }
    public void reset(){
        this.board = new Board(player1,player2);
        currentPlayer = player1;
    }
}