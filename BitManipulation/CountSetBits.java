package BitManipulation;

import java.util.Scanner;

public class CountSetBits {
    public static int countSetBits(int n){
        int count =0;
        int bitMask = 1;
        while(n > 0){
            int lsb = n & bitMask; //check lsb
            if(lsb == 1){  
                count++;
            }
            n= n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER A NUM :");
        int num=sc.nextInt();
        System.out.println(countSetBits(num));
        sc.close();
    }
    
}
