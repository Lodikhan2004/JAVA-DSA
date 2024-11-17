package Additional_Concept;
import java.util.*;
public class Average {
    public static double avg(int n1,int n2,int n3){
        int average=(n1+n2+n3)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Average of 3 numbers : "+ avg(a, b, c));
        sc.close();
        
    }
    
}
