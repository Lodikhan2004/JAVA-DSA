package ArrayList;

import java.util.ArrayList;

public class PairSumRotatedArr {
    public static void PairSumOpt(ArrayList<Integer> list, int target){
        int bp = -1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1; // smallest pointer
        int rp = bp;  // largest pointer
        int n = list.size();
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                System.out.println(list);
                System.out.println("("+lp+","+rp+")");
                return;
                // lp++;
                // rp--;
            }
            else if(list.get(lp) + list.get(rp) < target){
                lp = (lp +1)% n;
                
            }
            else{ // lp + rp > target
                rp = (n+ rp -1)% n;
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target =16;
        PairSumOpt(list, target);
    }
    
}
