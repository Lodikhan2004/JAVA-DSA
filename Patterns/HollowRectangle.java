package Patterns;
import java.util.*;
public class HollowRectangle {
    public static void hollow_rectangle(int row , int col){

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1|| i==row|| j==1 || j==col){
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
        System.out.println("ENTER NO OF ROWS AND COLUMNS:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        hollow_rectangle(row, col);
        sc.close();
    }
    
}
