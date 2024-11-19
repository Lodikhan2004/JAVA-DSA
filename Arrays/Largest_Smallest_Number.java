package Arrays;

import java.util.Scanner;

public class Largest_Smallest_Number {
    public static int getLargest(int arr[]){
        int largest=Integer.MIN_VALUE; // - infinity
        int smallest=Integer.MAX_VALUE; // + infinity
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                largest=arr[i];
            }
            if(arr[i] < smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest element in the array : "+ smallest);
        return largest;
        

    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        System.out.println("Enter array elements:");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
        int largest=getLargest(arr);
        System.out.println("Largest element in the array is: "+ largest);
        sc.close();
        
    }
    
}
