package string;

public class StringReverse {
    public static void main(String[] args) {
        String word = "Nikhil";
        StringBuilder reverse= new StringBuilder();
        for(int i =0;i<word.length();i++){
            reverse.insert(0, word.charAt(i));
        }
        System.out.println(reverse);
    }
}
