package gettingStarted;

public class LeapYear {
    public static void main(String[] args) {
        int year =1900;
        System.out.println(year+" Is leap year : "+isLeap(year));
    }
    public static boolean isLeap(int year){
        if(year%4 ==0){
            if (year%100 ==0 && year%400 ==0){
                    return true;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
