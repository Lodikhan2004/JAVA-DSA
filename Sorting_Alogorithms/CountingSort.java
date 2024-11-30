package Sorting_Alogorithms;

import java.util.Scanner;

public class CountingSort {
    public static void countsort(int arr[]){
        int n=arr.length;
        //find the largest no or range for count array
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(arr[i], largest);
        }
        
        //ex:if largest=5 then array will be from 0 to 4 but we want 5 also in array
        int count[] = new int[largest+1];
        
        //calculate frequency of each number in count array
        for(int i=0; i<arr.length;i++){ //traverse arr
            count[arr[i]]++;            //get the number arr[i] go to that index in count and update
        }
        //sorting
        int j=0;
        for(int i=0; i<count.length ;i++){ //traverse count array
            while(count[i]>0){  //if frequency is >0 then
                arr[j] = i;     //store the index of count in original array
                j++;            // increment actual array
                count[i]--;     //decrement frequency
            }
        }
    }
    public static void print(int arr[]){
        System.out.println("SORTED ARRAY IS:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
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
        countsort(arr);
        print(arr);
        sc.close();
        
    }
    
}
//TIME COMPLEXITY ==> O(n)
