package GreedyAlgorithms;

import java.util.*;
public class Chocola {
    public static void main(String[] args) {
        int n=4, m=6;
        Integer costVer[] = {2, 1, 3, 1, 4}; // m-1
        Integer costHor[] = {4, 1, 2}; // n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h=0, v=0; // Pointers for ver & hor arrays
        int hp=1, vp=1; // Track horizontal and vertical cuts
        int cost = 0;

        while(v < costVer.length && h < costHor.length){
            if(costVer[v] >= costHor[h]){ // if v > h then cut vertical
                //vetical cut
                cost += (hp * costVer[v]);
                vp++;
                v++;
            }
            else{
                //horizontal cut
                cost += (vp * costHor[h]);
                hp++;
                h++;
            }
        }
        while(v < costVer.length){
            // Remaining vetical cut
            cost += (hp * costVer[v]);
            vp++;
            v++;
        }
        while(h < costHor.length){
            //Remaining horizontal cut
            cost += (vp * costHor[h]);
            hp++;
            h++;
        }
        System.out.println("Min cost of cuts : " + cost);


    }
    
}
