package Divide_Conquer;

public class RotatedSortedArr {
    public static int searchInRotatedArr(int arr[],int si, int ei, int target){
        //Base Case
        if(si > ei){
            return -1;
        }
        //kaam
        int mid = si + (ei-si)/2;
        //Case found
        if(target == arr[mid]){
            return mid;
        }

        //Mid on Line 1
        if(arr[si] <= arr[mid]){
            //case a : left
            if( arr[si] <=target && target <=arr[mid]){
               return searchInRotatedArr(arr, si, mid-1, target);
            }
            //case b : right
            else{
                return searchInRotatedArr(arr, mid+1, ei, target);
            }

        }
        //Mid on Line 2
        else{
            //case c : right
            if(target >=arr[mid] && target <= arr[ei]){
                return searchInRotatedArr(arr, mid+1, ei, target);
            }
            //case d : left
            else{
                return searchInRotatedArr(arr, si, mid-1, target);
            }

        }

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target=0;
        int result = searchInRotatedArr(arr, 0, arr.length-1, target);
        System.out.println(result);
    }
    
}
