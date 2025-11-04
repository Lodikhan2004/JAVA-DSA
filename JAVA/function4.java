import java.util.Scanner;

public class function4 {
    public static void factorial(int n){
        if(n<0){
            System.out.print("INVALID");
            return;
        }
       int factorial=1;
       for(int i=n;i>=1;i--){
        factorial=factorial*i;
       }
       System.out.println("factorial of a no is:"+ factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NO:");
        int n=sc.nextInt();
        factorial(n);
        sc.close();

        
    }
    
}
