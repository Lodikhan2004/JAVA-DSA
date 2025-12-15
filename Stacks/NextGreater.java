package Stacks;
import java.util.*;

public class NextGreater {

    public static void Nextgreater(int arr[]){
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        int n = arr.length;
        for(int i=n-1; i>=0; i--){

            //arr[s.peek()] => we store index of elem in stack
            while(!s.isEmpty()  &&  arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //if- else
            if(s.isEmpty()){
                nextGreater[i] = -1;
            } else {
               nextGreater[i] = arr[s.peek()];
            }

            //push in s
            s.push(i); // pushing index of elem

        }

        //print
        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Nextgreater(arr);
        
    }
    
}
