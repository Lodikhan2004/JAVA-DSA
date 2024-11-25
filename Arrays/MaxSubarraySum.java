package Arrays;

import java.util.Scanner;

public class MaxSubarraySum {
    public static void maxsubarraysum(int arr[]){
        int maxSum=Integer.MIN_VALUE;   //-infinity
        int curSum=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                curSum=0;   // Re-initialized curSum=0 after calculating sum of each subarray
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+ " ");
                    curSum = curSum + arr[k];  
                }
                System.out.println(":"+curSum);  //printing curSum of each subarray
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
        maxsubarraysum(arr);
        sc.close();
    }
    
}
