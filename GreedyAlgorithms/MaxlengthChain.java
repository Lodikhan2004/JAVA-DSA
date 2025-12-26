package GreedyAlgorithms;

import java.util.*;
public class MaxlengthChain {
    public static int maxLenght(int pairs[][]){
        Arrays.sort(pairs,Comparator.comparingDouble(o-> o[1]));

        int chainLen = 1; // counter
        int pairEnd = pairs[0][1]; // Last selected pair end

        for(int i=1; i<pairs.length; i++){
            
            if(pairs[i][0] > pairEnd){ // start 
                chainLen++;
                pairEnd = pairs[i][1];
            }
        }
        return chainLen;
    }
    public static void main(String[] args) {
        int pairs[][] = {
            {5,24},
            {39,60},
            {5, 28},
            {27, 40},
            {50, 90}
        };
        System.out.println("Maximum chain lenght: " + maxLenght(pairs));
    }
}
