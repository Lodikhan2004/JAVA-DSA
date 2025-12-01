package ArrayList;

import java.util.ArrayList;

public class OptimizedContainerMW {
    public static int ContainerWithMaxWater(ArrayList<Integer> height){
        int maxWater = Integer.MIN_VALUE; // - inifity
       //O(n)
       int lp = 0;
       int rp = height.size()-1;

       while (lp < rp) {
        //calculate water area
        int ht = Math.min(height.get(lp), height.get(rp));
        int width = rp - lp;
        int currWater = ht * width;
        maxWater = Math.max(maxWater, currWater);
        //Update ptr
        //Always update the smaller pointer bcz it gives the maximum area ie smaller heigth it the water limitter
        if(height.get(lp) < height.get(rp)){
            lp++;
        }
        else{
            rp--;
        }
       }
        return maxWater;
       
              
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int result = ContainerWithMaxWater(height);
        System.out.println("Maximum water stored :" + result);
        
   
    }
}
