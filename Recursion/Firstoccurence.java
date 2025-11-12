package Recursion;

public class Firstoccurence {
    public static int firtocc(int arr[],int i ){

        int key =5;
        if(i == arr.length){
            return -1;
        }
       
        if(arr[i] == key){
            return i;
        }
        return firtocc(arr, i+1);
        
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firtocc(arr, 0));
        
    }
    
}
