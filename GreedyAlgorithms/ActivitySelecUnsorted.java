package GreedyAlgorithms;

import java.util.*;
public class ActivitySelecUnsorted {
    public static void main(String[] args) {
        int start[] = {5,1,3,0,8,5};
        int end[] = {7,2,4,6,9,9};

        //store idx | start | end in 2d array
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //lambda function -> shortform  (this will sort based on column 2 but shifts entire row)
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        for (int i = 0; i < activities.length; i++) {
            System.out.println(
                "Index: " + activities[i][0] +
                ", Start: " + activities[i][1] +
                ", End: " + activities[i][2]
            );
        }


        //end time basis sorted
        int maxAct = 0; //count
        ArrayList<Integer> ans= new ArrayList<>(); //store activity index

        maxAct =1;
        ans.add(activities[0][0]); //first activity
        int lastEnd = activities[0][2]; // first end time
    

        for(int i=1; i<end.length; i++){ // or i < start.length
            if(activities[i][1] >= lastEnd){
                //activity select
                maxAct++;
                ans.add(activities[i][0]); // add activity ind
                lastEnd = activities[i][2];
                
            }
        }
       
        System.out.println("Max acitviites :" + maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+ " ");
        }
        

    }
    
}
