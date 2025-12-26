package GreedyAlgorithms;

import java.lang.reflect.Array;
import java.util.*;
public class MinAbsoluteDiffPairs {
    public static int minAbsoluteDiff(int A[],int B[]){
        Arrays.sort(A); // 1 2 3
        Arrays.sort(B); // 1 2 3
        int minDiff = 0;
        
        for(int i =0; i<A.length; i++){
            minDiff += Math.abs(A[i] - B[i]);
        }
        return minDiff;

    }
    public static void main(String[] args) {
        int A[] = {1, 2, 3};
        int B[] = {2, 1, 3};
        System.out.println("Min Abosulute Difference of Pairs :" + minAbsoluteDiff(A, B));
    }
    
}
