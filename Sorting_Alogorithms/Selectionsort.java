package Sorting_Alogorithms;
import java.util.Scanner;
public class Selectionsort {
    public static void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0; i<=n-2;i++){  //we will not compare last element 
            int min=i;             // assume first element arr[0] is min
            for(int j=i+1;j<=n-1;j++){ //compare all elements from i+1 to n to find smallest 
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            //swap
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

            //print array at every iteration to understand flow of prog
            System.out.println("array at i ="+i);
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]);
            }
            System.out.println();
        }

        //sorted array
        System.out.println("Sorted array : ");
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
        selectionsort(arr);
        sc.close();
        
    }
    
}
//TIME COMPLEXITY====>O(n**2)
