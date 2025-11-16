package Divide_Conquer;

public class Quicksort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void quickSort(int arr[],int si, int ei){
        //Base Case
        if(si >= ei){
            return;
        }
        //kaam
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1);//left part of pivot
        quickSort(arr, pidx+1, ei);// right part of pivot
    }
    public static int partition(int arr[], int si, int ei){
        int pivot =arr[ei]; // arr.length-1 is wrong bcs pivot keeps changing for left and right 
        int i= si-1; // to make place for elem smaller than pivot

        for(int j=si; j<ei; j++){ // here j=si bsc si is not always 0 keeps changing  and j<ei not taking pivot
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //Place pivot to its right place
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i; //returning pivot index

    }
    public static void main(String[] args) {
        int arr[] ={6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
        
        
    }

    
}
