package GreedyAlgorithms;

import java.util.*;

public class JobSequencing {
    public static void jobsequence(int jobsInfo[][]){
        int jobs[][] = new int[jobsInfo.length][3];

        for(int i=0; i<jobsInfo.length; i++){
            jobs[i][0] = i;
            jobs[i][1] = jobsInfo[i][0];
            jobs[i][2] = jobsInfo[i][1];
        }
        //sort in ascending order
        Arrays.sort(jobs, Comparator.comparingDouble(o -> o[2]));

        int time =0;
        int count =0; // No of jobs selected
        for(int i=jobs.length-1; i>=0; i--){
            int deadline = jobs[i][1];
            if(deadline > time){
                count++; 
                time++;
                System.out.println(jobs[i][0]);

            }
        }
        System.out.println("Maximum jobs : " + count);

    }
    public static void main(String[] args) {
        int jobsInfo[][] = {
            {4, 20}, {1, 10}, {1, 40}, {1,30}
        };
        jobsequence(jobsInfo);
    }
    
}
