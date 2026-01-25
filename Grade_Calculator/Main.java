import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Subject> subjects = new ArrayList<>();
        int n =0;
        while(n!=2){
            System.out.println("Actions:- \n1.Add Subject\n2. Calculate");
            System.out.print("Choose Action:- ");
            n = scan.nextInt();
            if(n !=2){
                scan.nextLine();
                System.out.print("Name of Subject:- ");
                String name = scan.nextLine();
                System.out.print("Marks out of 100:- ");
                int marks = scan.nextInt();
                while(marks<0||marks>100){
                marks = scan.nextInt();
                }
                subjects.add(new Subject(name,marks));
            }
            else if(n==2){               
                int total = 0;
                for(Subject subject:subjects){
                    subject.printDetails();
                    total+= subject.getMarks();
                }
                double average = (double)total/Subject.noOfSub;
                System.out.println("\nTOTAL: "+total+"/"+Subject.noOfSub*100+"\nAverage: "+average);
                String grade;
                if(average>=91)grade ="O";
                else if(average>=81)grade="A+";
                else if(average>=71)grade="A";
                else if(average>=61)grade="B+";
                else if(average>=51)grade="B";
                else if(average>=41)grade="C";
                else grade = "Fail";
                System.out.println("Grade: "+grade);
            }
        }
    }
}