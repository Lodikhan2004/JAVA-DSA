package Sorting_Alogorithms;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Inbuiltsort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of array elements:");
        int n=sc.nextInt();
        Integer arr[]=new Integer[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    
        //Arrays.sort(arr);

        Arrays.sort(arr,0 , 3 ,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
       
        
        sc.close();
    }
    
}
