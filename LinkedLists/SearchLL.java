package LinkedLists;



public class SerarchLL {
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

    //Search key element
    public int searchKeyInLL(int key){ //O(n)
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                System.out.println("Key found at index");
                return i;
            }
            temp = temp.next;
            i++;
        }
        System.out.println("key not found");
        return -1;
    }
    //Recursive Search key elem
    public int isSearchRecursive(int key, Node temp,int i){//O(n)
        //Base case
        if(temp == null){
            return -1;
        }
        
        if(temp.data == key){
            return i;
        }
        int result = isSearchRecursive(key,temp.next,i+1);
        return result;
       
    }
    public static void main(String[] args) {
        SerarchLL ll = new SerarchLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
       // System.out.println(ll.searchKeyInLL(5));
        System.out.println(ll.isSearchRecursive(10, head, 0));
    }
    
    
}
