package Assignment;
import java.util.Scanner;
public class array1 {
    /*Given an integer array nums, return true if any value appears at least twice 
    in the array, and return false if every element is distinct*/
    public static boolean repeat(int arr[]){
       int n=arr.length;
       for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                return true;
            }
        }
       }
       return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of array elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the  positive array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       
        System.out.println(repeat(arr));
        sc.close();
        
    }
}
