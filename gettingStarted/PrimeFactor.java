package gettingStarted;

import java.util.ArrayList;

public class PrimeFactor {
    public static void main(String[] args) {
        int num =100;
        System.out.println(primeFactor(num));
    }
    public static ArrayList<Integer> primeFactor(int num){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=num;i++){
            if(num%i==0 && isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }

    public static boolean isPrime(int num){
       if(num==0 || num == 1 ){
           return false;
       }
       for(int i=2;i<num;i++){
           if(num%i==0){
                return false;
           }
       }
        return true;
    }
}
