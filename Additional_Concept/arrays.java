package Additional_Concept;

import java.util.Collections;
import java.util.Arrays;

public class arrays {
    public static int linearSearch(int arr[],int key){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
                
            }
        }
        return -1;


    }
    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= largest){
                largest = arr[i];
            }
            if(arr[i] <= smallest){
                smallest = arr[i];

            }

        }System.out.println("SMALLEST IS :" + smallest);
        return largest;

    }
    public static int binarySearch(int arr[],int key){
        int start =0;
        int end = arr.length -1;
        
        while(start <= end){
            int  mid = (start + end)/2;
            if(key == arr[mid]){
            
                return mid;
            }
            else{
                if(key< arr[mid]){//left
                    end = mid -1;
                }
                if(key > arr[mid]){// right
                    start = mid +1;
                }
            }
        }return -1;


    }
     
    public static void reverseArray(int arr[]){
        int rev[] =new int[5];
        int n = arr.length -1;
        int i=n;
        while(i>=0){
            for(int j=0; j<rev.length;j++){
                rev[j] =arr[i];
                i--;
            }
        }
        System.out.println("Reverse of array is: ");
        for(int k=0; k<rev.length; k++){
            System.out.print(rev[k] +" ");
        }
    }
    public static void reverseoptimised(int arr[]){
        int first=0;
        int last = arr.length -1;
        while(first<=last){
            int temp = arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;

        }
       
    }
    public static void pairs(int arr[]){
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + arr[i]+","+ arr[j]+ ")"+" ");
            }
            System.out.println();
        }
    }

    public static void subarray(int arr[]){
        for(int i=0; i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i; k<=j; k++){
                   System.out.print(arr[k]);
                }
                System.out.println();
                
            }
            System.out.println();
        }
    }

    public static void maxsubarray1(int arr1[]){
        int prefix[] = new int[arr1.length];
        int currsum =0;
        int maxsum = Integer.MIN_VALUE;
        prefix[0] = arr1[0];
        for(int i=1; i< prefix.length; i++){
            prefix[i] = prefix[i-1] + arr1[i];
        }

        for(int i=0; i<arr1.length; i++){
            for(int j=i; j<arr1.length; j++){
               
                currsum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(currsum > maxsum){
                    maxsum = currsum;
                }
               
            }
           
        }
        System.out.println(" maximum sum : "+ maxsum);
    }

    public static void kadanes(int arr[]){
        int currsum =0;
        int maxsum =Integer.MIN_VALUE;
        for(int i=0 ; i< arr.length; i++){
            currsum = currsum + arr[i];
            if(currsum < 0){
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
        }
        System.out.println("Maximum sum is :" + maxsum);
    }

    public static int  stocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i =0; i< prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);

            }else{
                buyPrice= prices[i];
            }
        }
        return maxProfit;

    }

    public static void bubble(int arr[]){
        int n =arr.length;
        for(int i=0; i<= n-2; i++){
            for(int j=0; j<= n-2-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("sorted array is:");
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i]);
        }
    }
    public static void selection(int arr[]){
        int n =arr.length;
       
        for(int i=0; i<= n-2; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
         System.out.println("sorted array is:");
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i]);
        }
        
    }

    public static void insertionSort(int arr[]){
        for(int i= 1; i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while( prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] =curr;
        }
        System.out.println("sorted array is:");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void printArr( int arr[]){
        System.out.println("sorted array is:");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            largest = Math.max(largest , arr[i]);
        }
        System.out.println(largest);
        int count[] = new int[largest+1];
        //frequency

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;

            }

        }
    }
    public static void main(String[] args) {
       int arr[]={1,4,1,3,2,4,3,7};
       countingSort(arr);
       printArr(arr);
       
      
      


         /*
         Arrays.sort(arr,2,5,Collections.reverseOrder());
       printArr(arr);
         reverseoptimised(arr);
        System.out.println("Reverse of array is: ");
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] +" ");
        }
       //reverseArray(arr);
       
       int key= 15;
       int index = binarySearch(arr, key);
       if(index ==-1){
        System.out.prin,tln("element not found");
       }else{,,
        System.out.println("Element " +key+ "found at index : "+ index);
       }
       
       Scanner sc = new Scanner(System.in);
       int key = 50;
       System.out.println("enter the array elements");
       for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("largest element is:" + largest(arr));
       int i=linearSearch(arr, key);
       if (i== -1){
        System.out.println("element not found");
       }else{
            System.out.println("Array element "+ key +" found at index :"+ i);

       }
        */
      
    }
    
}
