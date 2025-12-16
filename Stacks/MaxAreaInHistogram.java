package Stacks;

import java.util.*;

public class MaxAreaInHistogram {

    public static int MaxRecInHist(int arr[]){
        int maxArea = Integer.MIN_VALUE; // -infinity
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //Next Smaller Right
        Stack<Integer> s = new Stack<>();
        
        for(int i= arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length; // store n
            } else {
                nsr[i] = s.peek(); //top
            }
            s.push(i);
        }


        //Next Smaller Left
        s = new Stack<>();
        
        for(int i=0; i < arr.length; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1; // store -1
            } else {
                nsl[i] = s.peek(); //top
            }
            s.push(i);
        }

        //Current Area : width = j - i -1
        for(int i=0; i<arr.length; i++){
            int height = arr[i]; // Each bar
            int width = nsr[i] - nsl[i] - 1; //j-i-1

            int curArea = height * width;

            
            maxArea = Math.max(curArea, maxArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};//arr in histogram
        System.out.println("Maximum Area of Histogram is : "+MaxRecInHist(arr));

    }
    
}
