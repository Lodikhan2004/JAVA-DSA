package Arrays;

import java.util.Scanner;

public class MaxSubarray_PrefixSum {
    public static void maxsubarray_prefix(int arr[]){
        int maxSum=Integer.MIN_VALUE;   //-infinity
        int curSum=0;
        //Calculating prefix sum
        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                
                curSum = start == 0 ? prefix[end]: prefix[end] - prefix[start-1];   //formula to calculate subarray sum without extra loop
                if(maxSum < curSum){
                    maxSum =curSum; //update maximum sum
                }
            }
        }
        System.out.println("Maximum subarray is :"+ maxSum);
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
       maxsubarray_prefix(arr);
        sc.close();
    }
    
}

    

