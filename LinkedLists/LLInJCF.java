package LinkedLists;
import java.util.LinkedList; // JAVA COLLECTION FRAMEWORK
public class LLInJCF {
    public static void main(String[] args) {
        //create 
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(1);
        ll.addLast(4);
        ll.add(2, 10); // add at any index

        //print
        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
    
}
