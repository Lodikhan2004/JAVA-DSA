package Arrays;

import java.util.Scanner;

public class Bubblesort{
    public static void bubblesort(int arr[] ){
        int n= arr.length;
        for(int i=0 ; i<=n-2;i++){     //n-2 --> not compare last element 
            for(int j=0 ; j<=n-2-i; j++){   //the comparison range decreases because the largest elements are already sorted.
                if(arr[j] > arr[j+1]){
                    int temp =arr [j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        } 
        
        //print the array 
        System.out.println("SORTED ARRAY:");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
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
        bubblesort(arr);
        
        sc.close();
    }
}
