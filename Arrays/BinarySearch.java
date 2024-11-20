package Arrays;
import java.util.Scanner;
public class BinarySearch {

    public static int binarySearch(int arr[],int n,int key){
        int start=0;
        int end=n-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(key==arr[mid]){ //found
                return mid;
            }
            if(key<arr[mid]){
                end=mid-1;
            }
            else{             // if(key>arr[mid])
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of array elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the sorted array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the search element:");
        int key=sc.nextInt();
        int index =binarySearch(arr, n, key);
        System.out.println("Key element "+ key +" found at index "+ index);
        sc.close();
    }

    
}
