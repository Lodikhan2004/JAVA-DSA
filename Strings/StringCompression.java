package Strings;

public class StringCompression {
    public static String stringCompress(String str){
        String newStr ="";
        for(int i=0; i<str.length(); i++){
            Integer count = 1;   // bcs we need to convert the count into string
            while( i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){ //i<str.length()-1 ==> bcz last elem should not be compared
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println( "Compressed String is :" + stringCompress(str));
    }
    
}
//Time complexity ==> O(n)