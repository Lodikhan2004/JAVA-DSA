package LinkedLists;

public class RemoveNthNodefromEnd {
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

    public void removeNthNode(int n){
        //calculate size of ll 
        int size=0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        //if we need to remove head itself
        if(n == size){ // from back wards
            head = head.next;
            return;
        }

        Node prev,cur;
        prev = head;
        int i =1;
        while(i < size-n){
            prev = prev.next;
            i++;
        }
        cur = prev.next;
        prev.next = cur.next; 
        return;
    }
    public static void main(String[] args) {
        RemoveNthNodefromEnd ll = new RemoveNthNodefromEnd();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.removeNthNode(4);
        ll.print();
    }
    
}
