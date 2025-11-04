import java.util.Scanner;

public class function3 {
    public static int multiplication(int a,int b){
        int product=0;
        product=a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=multiplication(a, b);
        System.out.print("PRODUCT OF TWO NO:"+  res);
        sc.close();

        
    }
    
}

