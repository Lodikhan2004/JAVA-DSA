import java.util.Scanner;

public class function9 {
    public static boolean eligibleToVote(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        System.out.println(eligibleToVote(age));
        sc.close();
    }
}
