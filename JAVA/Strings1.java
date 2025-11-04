import java.util.Scanner;

public class Strings1 {
    public static void main(String[] args) {
        //taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        System.out.println("Your name is: "+ name);
        sc.close();
    }
    
}
