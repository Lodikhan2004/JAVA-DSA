package Stacks;
import java.util.*;

public class DuplicateParantheses {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            //closing
            if(ch == ')'){
                int count =0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true; //duplicate exist
                }
                else{
                    s.pop(); // pop the opening bracket
                }
            }
            //opening 
            else{
                s.push(ch);
            }
        }
        return false; // no duplicate
    }
    public static void main(String[] args) {
        String str = "((a+b)+(a-b))";
        String str1 = "((a-b))";
        if(isDuplicate(str)){
            System.out.println("Duplicate paranthese exist");
        }
        else{
            System.out.println("Duplicate parantheses does not exist");
        }
        
    }
    
}
