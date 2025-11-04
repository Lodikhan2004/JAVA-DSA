import java.util.Scanner;
//DISPLAYS THE COUNT OF NUMBERS 
public class function11 {
    public static void main(String[] args) {
        int positive=0,negative=0,zero=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to take input/ 0 to stop");
        int input= sc.nextInt();
        while(input==1){
            System.out.println("Enter the number:");
            int num=sc.nextInt();
            if(num>0){
                positive++;
            }
            else if(num<0){
                negative++;
            }
            else{
                zero++;
            }
            System.out.println("Enter 1 to take input/ 0 to stop");
            input= sc.nextInt();
        }
        
        System.out.println("positive numbers:"+ positive);
        System.out.println("negative numbers:"+ negative);
        System.out.println("zeros:"+ zero);
        sc.close();


    }

    
}
