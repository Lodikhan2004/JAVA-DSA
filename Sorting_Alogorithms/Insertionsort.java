package Sorting_Alogorithms;

import java.util.Scanner;

public class Insertionsort {
    public static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<=n-1;i++){ // outter loop runs from i=1 to n
            int j=i-1;           // previous element 
            int temp=arr[i];     // save the ith element in a variable
           
            while(j>-1 && arr[j]>temp){  // j should be equal to 0 or >0 && compare if arr[j]> temp 
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;               //push the temp element on the j+1 slot
        }
        //print sorted array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
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
        insertionSort(arr);
        sc.close();
    }
}
//TIME COMPLEXITY====>O(n**2)
    

