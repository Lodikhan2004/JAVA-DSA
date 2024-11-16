package Additional_Concept;
import java.util.*;
public class function {
    public static int printHello(){
        System.out.println("Hello world");
        return 0;

    }
    public static int  sum(int a,int b){ // parameters or formal parameters
        int sum=a+b;
        //System.out.println("Sum of a and b: "+sum);
        return sum;
    }
    public static float multiply(int a,int b){
        return a*b;
    }
    
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //int res=sum(a, b); // arguments or actual parameters
        //System.out.println(res);

         float res=multiply(a, b);
         System.out.println(res);
        sc.close();

    }
}
