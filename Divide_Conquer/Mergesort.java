package Divide_Conquer;

public class Mergesort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void mergeSort(int arr[], int si , int ei){
        //Base Case
        if(si >= ei){
            return;
        }
        //kaam
        int mid = si + (ei-si)/2; // (si + ei)/2
        
        mergeSort(arr, si, mid); //left call 
        mergeSort(arr, mid+1, ei); //right call

        //merge
        merge(arr, mid, si, ei);
    }

    public static  void merge(int arr[], int mid, int si , int ei){
        //left(0,3) = 4 elem  right(4,6) =3 -> then i require 7 elem [6-0+1=7]
        int temp[] = new int[ei-si+1];
        int i = si;     // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0;    // iterator for temp array
        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //left part rem elem
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //right part rem elem
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        //Copy temp arr elements -> original arr
        for(i=si, k=0; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {

        int arr[] ={6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
