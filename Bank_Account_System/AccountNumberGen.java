public class AccountNumberGen{
    private static long accountNumber=1000000000;
    
    public static long accountNumberGen(){
        return ++accountNumber;
    }
}