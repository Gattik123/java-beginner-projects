public class AccountNumberGen{
    private static long accountNumber=100;
    
    public static long accountNumberGen(){
        return ++accountNumber;
    }
}