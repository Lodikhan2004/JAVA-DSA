package Additional_Concept;
import java.util.*;
public class swap {
    public static void swaping(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a : "+ a + " b : "+b);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swaping(a,b);
        sc.close();
    }
}
