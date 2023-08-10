package string;

public class StringLength {
    public static void main(String[] args) {
        String str = " My name is : Nikhil ";
        char[] strArray = str.toCharArray();
        int len=0;
        for(char c : strArray){
            len++;
        }
        System.out.println("length of "+ str +" is "+len);
    }
}
