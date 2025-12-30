public class Board{
    private Player player1;
    private Player player2;
    private char[] board;
    private int count = 0;

    Board(Player player1,Player player2){
        this.player1 =player1;
        this.player2 = player2;
        board = new char[9];
        count = 0;
        for(int i=0;i<9;i++){
                board[i]= (char)('1'+i);
        }
    }
    public void print(){
        System.out.println("-------------");
        System.out.println("| "+board[0]+" | "+board[1]+" | "+board[2]+" |");
        System.out.println("-------------");
        System.out.println("| "+board[3]+" | "+board[4]+" | "+board[5]+" |");
        System.out.println("-------------");
        System.out.println("| "+board[6]+" | "+board[7]+" | "+board[8]+" |");
        System.out.println("-------------");
    }
    public boolean placeMark(int index,char marker){
        if(index<0||index>8)return false;
        if(board[index]==player1.getMarker()||board[index]==player2.getMarker())return false;
        board[index]=marker;
        count++;
        return true;
    }
    public char getWinner() {
        int[][] winPositions = {
            {0,1,2}, {3,4,5}, {6,7,8}, // rows
            {0,3,6}, {1,4,7}, {2,5,8}, // columns
            {0,4,8}, {2,4,6}           // diagonals
        };
        for (int[] i : winPositions) {
            if (board[i[0]] == board[i[1]] &&
                board[i[1]] == board[i[2]] &&
                (board[i[0]] == player1.getMarker() || board[i[0]] == player2.getMarker())) {
                return board[i[0]];
            }
        }
        return ' ';
    }
    public boolean isFull(){
        if(count==9)return true;
        else return false;
    }
}