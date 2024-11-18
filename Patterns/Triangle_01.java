package Patterns;

import java.util.Scanner;

public class Triangle_01 {
    public static void triangle01(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               if((i+j)%2==0){
                System.out.print("1"+" ");
               }
               else{
                System.out.print("0"+" ");
               }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        triangle01(n);
        sc.close();
        
        
    }
    
}
