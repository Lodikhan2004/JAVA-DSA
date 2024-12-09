package BitManipulation;
import java.util.*;
public class FastExpo {
    public static int fastExpo(int a ,int n){
        int ans =1;

        while(n >0){
            if((n & 1) != 0){
                ans = ans *a;
            }
            a= a*a;
            n= n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER a and n :");
        int a = sc.nextInt();
        int n= sc.nextInt();
        System.out.println(fastExpo(a, n));
        sc.close();
    }
    
}
