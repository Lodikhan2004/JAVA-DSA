package GreedyAlgorithms;

import java.util.Comparator;
import java.util.*;

public class FractionalKnapsack {
    public static double FracKnapSack(int val[],int weight[],int W){
        //ratio
        double ratio[][] = new double[val.length][2];
        //0th col => idx; 1st col => ratio

        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double)weight[i];
        }
        //Ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        double maxVal =0;
        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int) ratio[i][0];
            if(capacity >= weight[idx]){ // include full item

                capacity = capacity - weight[idx];
                maxVal = maxVal + val[idx];

            } else { // include fractional item
                
                maxVal = maxVal + (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;
        System.out.println(FracKnapSack(val, weight, W));
    }
    
}
