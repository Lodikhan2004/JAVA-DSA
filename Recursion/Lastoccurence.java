package Recursion;

public class Lastoccurence {
    public static int lastocc(int arr[],int i ){

        int key =5 ;
        if(i == -1){
            return -1;
        }
       
        if(arr[i] == key){
            return i;
        }
        return lastocc(arr, i-1);
        
    }
    public static void main(String[] args) {
        int arr[] = {5,5,5,5};
        int i= arr.length-1;
        System.out.println(lastocc(arr, i));
        
    }
    
}
