import java.util.Scanner;

public class function8 {
    public static Double circumOfCircle(Double radius){
        Double circumference=2* 3.14 *radius;
        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        Double radius=sc.nextDouble();
        System.out.println("circumference of a circle is:"+ circumOfCircle(radius));
        sc.close();

    }
}
