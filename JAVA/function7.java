import java.util.*;
public class function7 {
    public static int greatestOf2No(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res = greatestOf2No(a, b);
        System.out.println("Greatest of 2 numbers is:"+res);
        sc.close();
        
    }

    
}