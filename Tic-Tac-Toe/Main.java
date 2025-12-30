public class Main{
    public static void main(String[] args){
        Player player1 = new Player("Gattik", 'X');
        Player player2 = new Player("Player", 'O');
        Board board = new Board(player1,player2);
        Game newGame = new Game(player1,player2);
        newGame.start(); 
    }
}