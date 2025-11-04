import java.util.Scanner;

public class function12 {
    /* 
    public static void getPow(double x,int n){
        double res= Math.pow(x,n);
        System.out.println(res);
    }*/
    //METHOD 2
    public static void getpow(double x, int n){
        double res=1;
        for(int i=0; i<n;i++){
             res=res*x;
        }
        System.out.println(res);    
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the value of x and n:");
          int x=sc.nextInt();
          int n=sc.nextInt();
          getpow(x, n);
          sc.close();
    }
}   

