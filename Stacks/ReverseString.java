package Stacks;
import java.util.*;

public class ReverseString {
    
    public static String reverseStr(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            s.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder("");
        while(!s.isEmpty()){
            char cur = s.pop();
            sb.append(cur);
        }
        return sb.toString();
        
    }
    public static void main(String[] args) {
        String str = "afzal";
        System.out.println(reverseStr(str));
    }
    
}
