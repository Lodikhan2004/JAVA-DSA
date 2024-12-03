package Strings;

public class stringBuilder {
    
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("");
        for(char ch='a'; ch<='z';ch++){
                sb.append(ch); //adds each character at the end of the string
        }
        System.out.print(sb);     
    }
    //O(n) ==> StringBuilder
    //O(n^2) ==> String (bcz every time the same string is copied and then append)
        
}
    

