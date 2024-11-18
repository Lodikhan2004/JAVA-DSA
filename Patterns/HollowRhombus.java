package Patterns;

import java.util.Scanner;

public class HollowRhombus {
    public static void hollowRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){  //print spaces
                System.out.print(" ");
            }
            //print hollow rectangle
            for(int j=1;j<=n;j++){    
                if(i==1|| i==n|| j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(); 
    }
}
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        hollowRhombus(n);
        sc.close();
        
}
}
