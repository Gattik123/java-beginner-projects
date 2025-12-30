public class Player{
    private String name;
    private char marker;
    Player(String name,char marker){
        this.name = name;
        this.marker = marker;
    }

    public String getName(){
        return this.name;
    }
    public char getMarker(){
        return this.marker; 
    }
}