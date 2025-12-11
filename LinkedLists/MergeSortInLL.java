package LinkedLists;
import java.util.LinkedList;

public class MergeSortInLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Add node at last of linked list
    public void addLast(int data){
        //step 1 : create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        //step 2 : Connect tail.next to  new node 
        tail.next = newNode;

        //step 3 : make new node as tail
        tail = newNode;

    }

    //print complete Linked list
    public void print(){// O(n) 
        if(head == null){
            System.out.println("Empty LL");
            return;
        }

        Node temp = head; // created a temp pointer
        while(temp != null){
            System.out.print(temp.data + "  -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    

    public Node mergeSort(Node head){
        //Base case 
        if(head == null || head.next == null){
            return head;
        }

        //find mid
        Node mid = getMid(head);
        
        //left & right ms
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head); //left half
        Node newRight = mergeSort(rightHead); //right half

        //merge
        return merge(newLeft , newRight);
    }
    //Get Middle node
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
        } 
        return slow;  // mid node 
    } 
    // Merge two sorted linked list
    public Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1); // dummy node
        Node temp = mergedLL; //pointer to track mergedLL

        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                temp.next = head1;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        //remaining left half
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        //remaining right half
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next; // return actual head which is after dummy node

    }
    public static void main(String[] args) {
        MergeSortInLL ll = new MergeSortInLL();
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();

        ll.head = ll.mergeSort(ll.head);
        ll.print();


        
    }
    
    
}
