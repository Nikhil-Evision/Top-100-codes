package string;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String word1 = "nikhil";
        String word2 = "hilnik";
        System.out.println("Anagram : "+ isAnagram(word1,word2));
        System.out.println();

    }
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        else {
            char [] ar1 = str1.toLowerCase().toCharArray();
            char [] ar2 = str2.toLowerCase().toCharArray();
            Arrays.sort(ar1);
            Arrays.sort(ar2);

            return Arrays.equals(ar1, ar2);
        }
    }
}
