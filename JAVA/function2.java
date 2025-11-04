import java.util.Scanner;

public class function2 {
    public static int addition(int a,int b){
        int sum=0;
        sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=addition(a, b);
        System.out.print("ADDITION OF TWO NO:");
        System.out.print(res);
        sc.close();

    }
    
}
