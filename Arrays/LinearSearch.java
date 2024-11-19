package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        System.out.println("Enter array elements:");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
        System.out.println("Enter the search element:");
        int key=sc.nextInt();
        int index =linearSearch(arr,key);
        System.out.println("Key element "+key+"found at index "+index);
        sc.close();
        
    }

    
}
