import java.util.*;
public class function1 {
    public static void printMyName(String name){
        System.out.print(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NAME:");
        String name=sc.next();
        printMyName(name);
        sc.close();

    }
}
