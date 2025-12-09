package LinkedLists;

public class ReverseLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
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
    
    //Reverse Linked List
    public void reverse(){
        Node cur, prev, nex;
        prev = null;
        cur = tail = head;
        while(cur != null){
            nex = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nex;
        }
        head = prev;
    }
    public static void main(String[] args) {
        ReverseLL ll = new ReverseLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.reverse();
        ll.print();
        System.out.println("Head of LL :" + head.data);
        System.out.println("Tail of LL : " + tail.data);
    }
    
}
