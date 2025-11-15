package Recursion;

public class AllOccurenceAS {
    public static void alloccur(int arr[],int i,int key){
        if(i == arr.length){
            return;
        }
        if(key == arr[i]){
            System.out.print(i + " ");
        }
        alloccur(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        alloccur(arr, 0, 2);
        
    }
    
}
