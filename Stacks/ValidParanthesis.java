package Stacks;

import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValidParanthesis(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){

            Character curChar = str.charAt(i);
            //Opening
            if(curChar == '(' || curChar == '{' || curChar == '['){
                s.push(curChar);
            }
            else{
            //closing
            // else if(curChar == ')' || curChar == '}' || curChar == ']')
                
                if( (s.peek() == '(' && curChar == ')')
                    ||(s.peek() == '[' && curChar == ']')
                    ||(s.peek() == '{' && curChar == '}')
                ){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "(()[]{})";
        System.out.println(isValidParanthesis(str));
    }
}
