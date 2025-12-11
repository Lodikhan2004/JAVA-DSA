package LinkedLists;

public class DoublyLL {
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
    

    //Add First
    public void addFirst(int data){
        //create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;   
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

    //remove first
    public int removeFirst(){
        if(head == null){
            System.out.println("Empty DLL");
            return -1;
        }
        if(head.next == null && head.prev == null){
            int val = head.data;
            head = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    //remove last
    public int removeLast(){
        if(head == null){
            System.out.println("Empty DLL");
            return -1;
        }
        if(head.next == null && head.prev == null){
            int val = head.data;
            head = null;
            tail = null;
            size--;
            return val;
        }
        int val = head.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addLast(0);
        dll.print();
        System.out.println("Size of dll : " + size);
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        System.out.println("Size of dll : " + size);

    }
}
