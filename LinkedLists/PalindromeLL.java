package LinkedLists;

public class PalindromeLL {
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

    //find middle node =>slow fast technique
    public Node middleNode(Node head){
        Node slow ,fast;
        slow = head;
        fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;  //+1
            fast = fast.next.next; //+2
        }
        return slow;
    }

    public boolean palindrome(){
        //Base case 
        if(head == null || head.next == null){
            return true;
        }
        //step 1 : find mid
        Node midNode = middleNode(head);

        //step 2 : reverse 2nd half
        Node prev, cur, nex;
        prev = null;
        cur = tail = midNode;
        while(cur != null){
            nex = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nex;
        }
        Node right = prev; //right half head
        Node left = head; // left half head

        //step 3 : check left half and right half
        while(right != null){
            if(left.data != right.data){
                return false; //not palindrome
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeLL ll = new PalindromeLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        //ll.addLast();
        ll.print();
        System.out.println(ll.palindrome());
    }
    
}
