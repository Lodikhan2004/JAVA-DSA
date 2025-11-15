package Recursion;

public class IntToStringOfEng {
    public static void intToEng(String s,int i,String map[],StringBuilder newStr){
        if(i == s.length()){
            System.out.println(newStr);
            return;
        }
        // convert "1" -> 1 ie ascii of 1 is 49 => 49-48=0 
        int idx =s.charAt(i)-'0'; 
        intToEng(s, i+1, map, newStr.append(map[idx]));
    }
    public static void main(String[] args) {
        String map[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int n = 1947;
        String s = Integer.toString(n);
        intToEng(s, 0, map, new StringBuilder(""));
        
    }
    
}
