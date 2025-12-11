package LinkedLists;

public class ReverseDLL {
    public static class Node{
        int data;
        Node prev;
        Node next;
    
        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
        
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //print complete Linked list
    public void print(){// O(n) 
        if(head == null){
            System.out.println("Empty LL");
            return;
        }

        Node temp = head; // created a temp pointer
        while(temp != null){
            System.out.print(temp.data + "  <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Add Last
    public void addLast(int data){
        //create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }
    public void reverseDll(){
        Node prev, cur, next;
        prev = null;
        cur = head;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            cur.prev = next;

            prev = cur;
            cur = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        ReverseDLL dll = new ReverseDLL();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.print();
        dll.reverseDll();
        dll.print();

    }
    
}
