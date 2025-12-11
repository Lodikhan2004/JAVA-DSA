package LinkedLists;

public class ZigZagLL {
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
    public Node midNode(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node reverse(Node head){
        Node prev,cur,nex;
        prev = null;
        cur = head;
        while(cur != null){
            nex = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nex;
        }
        head = prev;
        return head;
    }
    public void zigZag(){
        //find mid node
        Node mid = midNode(head);
        

        //Reverse second half
        Node RH = reverse(mid.next);
        mid.next = null;
        Node LH = head;
        
        Node nextL,nextR;

        //merge alternating
        while(RH != null && LH != null){
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;
            LH = nextL;
            RH = nextR;
        }
        
    }
    public static void main(String[] args) {
        ZigZagLL ll = new ZigZagLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.zigZag();
        ll.print();
    }
    
}
