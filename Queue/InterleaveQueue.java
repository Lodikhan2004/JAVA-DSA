package Queue;
import java.util.*;
public class InterleaveQueue {
    public static void Interleavequeue(Queue<Integer> q){ //O(n)
        Queue<Integer> q2 = new LinkedList<>();
        //Add n/2 elem in q2
        int size = q.size();
        int i =0;
        while(i < size/2){
            q2.add(q.remove());
            i++;
        }
        //Interleave queue
        while(!q2.isEmpty()){
            q.add(q2.remove()); // iterate through q2 and add in original queue
            q.add(q.remove()); // iterate through original and append after q2 at each iteration   
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        
        Interleavequeue(q);
        //print Interleave queue
        while(!q.isEmpty()){
            System.out.print(q.peek() +" ");
            q.remove();
        }
    }
    
}
