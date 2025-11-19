package Sorting_Alogorithms;

import java.util.Scanner;

public class Bubblesort{
    public static void bubblesort(int arr[] ){
        int n= arr.length;
        for(int i=0 ; i<=n-2;i++){     //n-2 --> not compare last element 
            boolean swapped = false;
            for(int j=0 ; j<=n-2-i; j++){   //the comparison range decreases because the largest elements are already sorted.
                if(arr[j] > arr[j+1]){
                    int temp =arr [j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    swapped = true;
                }
            }
            if(swapped == false){ // if no swapp's happend then it is sorted come out of the loop
                break;
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
//TIME COMPLEXITY==>O(n**2) for normal code 
/*Time complexity for optimized code :
Worst case : O(n**2)
Best case : O(n) */
