package Recursion;

public class BinaryStrings {
    public static void BinStr(int n,String str, int lastPlace){
        if(n == 0){
            System.out.println(str);
            return;
        }
        //Kaam
        BinStr(n-1, str+"0", 0);
        if(lastPlace == 0){
            BinStr(n-1, str+"1", 1);
        }
       
    }
    public static void main(String[] args) {
        BinStr(3, new String(""), 0);  
    }
    
}
