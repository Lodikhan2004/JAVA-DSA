package Additional_Concept;
import java.util.*;
public class BinaryToDecimal {

    public static void binToDec(int binNum){
        int pow=0;
        int lastDigit;
        int decNum=0;
        while(binNum>0){
            lastDigit=binNum%10;
            decNum=decNum+(lastDigit * (int)Math.pow(2,pow));
            binNum=binNum/10;
            pow++;
        }
        System.out.println(decNum);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER A BINARY NUMBER");
        int n=sc.nextInt();
        binToDec(n);
        sc.close();
    }
    
}
