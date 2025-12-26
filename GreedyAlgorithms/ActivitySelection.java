package GreedyAlgorithms;

import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //end time basis sorted
        int maxAct = 0; //count
        //ArrayList<Integer> ans= new ArrayList<>(); //store activity index

        maxAct =1;
        //ans.add(0);
        int lastEnd = end[0];
        System.out.print("A0 ");

        for(int i=1; i<end.length; i++){ // or i < start.length
            if(start[i] >= lastEnd){
                //activity select
                maxAct++;
                //ans.add(i);
                lastEnd = end[i];
                System.out.print("A"+i +" ");
            }
        }
        System.out.println();

        System.out.println("Max acitviites :" + maxAct);
        // for(int i=0; i<ans.size(); i++){
        //     System.out.print("A"+ans.get(i)+ " ");
        // }
        

    }
    
}
