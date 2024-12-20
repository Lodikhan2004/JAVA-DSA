package Arrays;

import java.util.Scanner;

public class PairsInArray {
    public static void printPairs(int arr[]){
        int totalpairs=0;
        for(int i=0; i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1; j<arr.length;j++){
                    System.out.print("("+ curr + "," + arr[j] + ")");
                    totalpairs++;
            }
            System.out.println();
        }
        System.out.println("TOTAL PAIRS :"+ totalpairs);
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
        printPairs(arr);
        sc.close();
    }
    
}
