package Arrays;

import java.util.Scanner;

public class SubArray {

    public static void subarray(int arr[]){
        
        for(int i=0;i<arr.length;i++){       //start 
            int start=i;
            for(int j=i; j<arr.length; j++){  //end
                int end=j;
                for(int k=start ; k<=end; k++){ //print 
                    System.out.print(arr[k]+" "); // subarray
                }
                System.out.println();
            }
            
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
        subarray(arr);
        sc.close();
    }
    
}
