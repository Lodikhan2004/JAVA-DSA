package Additional_Concept;
import java.util.*;
public class DecimalToBinary {
    public static void decToBin(int decNum){
        int rem;
        int binNum=0;
        int pow=0;
        while(decNum>0){
            rem=decNum % 2;
            binNum= binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum=decNum/2;
        }
        System.out.println(binNum);
       
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER A DECIMAL NUMBER");
        int n=sc.nextInt();
        decToBin(n);
        sc.close();
    }
    
    
}
