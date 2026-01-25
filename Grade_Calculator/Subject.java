public class Subject{
    private String name;
    private int marks;
    public static int noOfSub=0;
    Subject(String name, int marks){
        this.name = name;
        this.marks = marks;
        noOfSub++;
    }
    public int getMarks(){
        return marks;
    }
    public void printDetails(){
        System.out.println(this.name+":"+this.marks);
    }
}