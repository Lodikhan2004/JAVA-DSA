package ArrayList;

import java.util.ArrayList;

public class MaximumInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // O(n)
        int  max = Integer.MIN_VALUE; //-infinity
        for(int i=0; i< list.size(); i++){
            // if(list.get(i) > max){
            //     max = list.get(i);
            // }
            max = Math.max(max , list.get(i));
        }
        System.out.println("Maximum elem in ArrayList is :" + max);
      
    }
    
}
