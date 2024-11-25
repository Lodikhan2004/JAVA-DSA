package Arrays;

import java.util.Scanner;

public class MaxSubarray_Kadanes {
    //This function will not work for all -ve numbers in array
    public static void kadanes(int arr[]){
        
        int maxSum = Integer.MIN_VALUE;// -infinity
        int curSum=0;
        for(int i=0;i<arr.length;i++){
            curSum= curSum+ arr[i];
            if(curSum< 0){
                curSum =0;
            }
            maxSum = Math.max(curSum, maxSum);
        }
        System.out.println("Maximum subarray sum is :"+ maxSum);
    }
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of array elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        kadanes(arr);
        sc.close();
    }
    
}
