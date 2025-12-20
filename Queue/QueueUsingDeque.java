package Queue;

import java.util.*;
public class QueueUsingDeque {
    static class Queue{
        Deque<Integer> deque = new LinkedList<>();
        //add
        public void add(int data){
            deque.addLast(data);
        }

        //remove
        public int remove(){
            return deque.removeFirst();
        }

        //peek
        public int peek(){
            return deque.getFirst();
        }
         
        //isEmpty
        public boolean isEmpty(){
            return deque.isEmpty();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
    
}
