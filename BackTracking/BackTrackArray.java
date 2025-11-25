package BackTracking;

import Strings.printCharacters;

public class BackTrackArray {
    public static void backArray(int arr[] , int i){
        //Base Case
        if(i == arr.length){
            printArray(arr);
           
            return;

        }
        //Recursion
        arr[i] = i+1;
        backArray(arr, i+1);
        //Backtracking step
        arr[i] = arr[i] -2;

    }
    public static void printArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        backArray(arr, 0);
        printArray(arr);
        
    }
    
}
