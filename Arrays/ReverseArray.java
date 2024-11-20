package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int arr[],int n){
        int start=0;
        int end=n-1;
         while(start<end){
                int temp=arr[end];
                arr[end]=arr[start];
                arr[start]=temp;

                start++;
                end--;
            }
          
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
        reverseArray(arr, n);
        System.out.println("Array elements after reversing:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
    
}
