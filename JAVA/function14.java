import java.util.Scanner;
//FIBONACCI SERIES
public class function14 {
    public static void fibonacci(int n){
        int first_term=0,sec_term=1;
        System.out.println(first_term+" "+sec_term);
        for(int i=2;i<=n;i++){
            int cur_term=first_term+sec_term;
            System.out.print(cur_term+" ");
            first_term=sec_term;
            sec_term=cur_term;
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        fibonacci(n);
        sc.close();
    }
    
}
