package LinkedLists;

public class DemoLL {
    //Create a node
    public static class Node{
        
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head; // Head pointer
    public static Node tail; // Tail pointer
    public  static int size; // size
    
    //Add node in front of linked list
    public void addFirst(int data){

        Node newNode = new Node(data); // step1 : create new node
        size++;
        if(head == null){ // Base case : if no nodes in ll
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head; // step 2 : link next to head
        head = newNode; //step 3 : make new node n1 as head
    }

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
    
    //Add in the Middle
    public void AddInMid(int idx, int data){
        //if idx =0 ie adding at head
        if(idx == 0){
            addFirst(data);
            return;
        }

        //step 1 : create new node
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp ->prev
        newNode.next = temp.next; 
        temp.next = newNode;
    }

    // Remove first element
    public int removeFirst(){
        if(size == 0){
            System.out.println("No elements to remove");
            return -1;

        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //Remove last elem
    public int removeLast(){
        if(size == 0){
            System.out.println("Empty LL");
            return -1;

        }else if(size == 1){
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = tail.data;
        Node temp = head;
        int i = 1;
        while(i < size-1){
            temp = temp.next;
            i++;
        }
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    
   
    public static void main(String arg[]){
        DemoLL ll = new DemoLL();
       
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.AddInMid(2, 3);
        ll.print();
        //System.out.println("Size of the Linked List : "+ size); // or ll.size

        System.out.println("Element removed is: " + ll.removeLast());
        ll.print();
       

      



        // System.out.println(head.data);
        // System.out.println(head.next);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next);
        // System.out.println(tail.data);
        // System.out.println(tail.next);
       
        // ll.head = new Node(1);
        // ll.tail = ll.head.next = new Node(2);
       
    
    }
    
}
