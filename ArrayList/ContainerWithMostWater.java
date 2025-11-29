package ArrayList;
import java.util.ArrayList;

public class ContainerWithMostWater {
    public static int ContainerWithMaxWater(ArrayList<Integer> height){
        int max = Integer.MIN_VALUE; // - inifity
       //O(n^2)
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int hght = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int water = hght * width;
                max = Math.max(max, water);
            }
        }
        return max;
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
