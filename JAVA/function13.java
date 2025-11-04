//GCD OF 2 NUMBERS
import java.util.Scanner;
public class function13{
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter n1 and n2:");
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    while(n1!=n2){
        if(n1>n2){
            n1=n1-n2;
        }
        else{
            n2=n2-n1;
        }
    }
    System.out.println("The GCD of 2 number is: "+n1);
    sc.close();
}
}