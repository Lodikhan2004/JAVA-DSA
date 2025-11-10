package Recursion;


public class ArrayIsSorted {
    public static boolean isSorted(int arr[],int i){
    //Base condition : we return true bcs as we reached the last element since the previous elements are sorted
    if(i == arr.length-1){
        return true;
    }
    //First comparison
    if(arr[i] > arr[i+1]){
        return false;
    }
    //if true then compare next pair and return  
    return isSorted(arr,i+1);

}
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(isSorted(arr, 0));

        
    }
    
}
