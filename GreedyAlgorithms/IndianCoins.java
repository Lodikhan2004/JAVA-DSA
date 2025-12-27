package GreedyAlgorithms;

import java.util.*;
public class IndianCoins {
    public static int indianCoins(int cur[], int V){
        //Arrays.sort(cur)
        Arrays.sort(cur);
        int val= V;
        int ans=0;
        for(int i=cur.length-1; i>=0; i--){
            if(cur[i] <= val){
                while(cur[i] <= val){
                    ans++;
                    val = val - cur[i];
                    System.out.print(cur[i]+ " ");
                }
            }
           
        }
        System.out.println();
        return ans;
        
    }
    public static void main(String[] args) {
        int currency[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int V = 590;
        System.out.println("Change for the given value is:" + indianCoins(currency, V));
    }
    
}
