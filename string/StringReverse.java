package string;

public class StringReverse {
    public static void main(String[] args) {
        String word = "Nikhil";
        String reverse="";
        for(int i =0;i<word.length();i++){
            reverse= word.charAt(i)+reverse;
        }
        System.out.println(reverse);
    }
}
