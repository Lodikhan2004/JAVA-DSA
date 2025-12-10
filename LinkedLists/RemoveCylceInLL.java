package LinkedLists;

public class RemoveCylceInLL {
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

    public static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void removeCycle(){
        //Step 1: Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false; // initial cycle not exist
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                System.out.println("cycle exists");
                cycle = true;
                break;
            }
        }
        if(cycle == false){ // after traverse no cycle
            System.out.println("cycle doesnt exits");
            return;

        }

        //Step 2 : find meeting point again
        slow = head;
        Node prev = null;
        while(slow != fast){
            slow = slow.next; // +1
            prev = fast; // track previous node of fast
            fast = fast.next; //+1
        }
        //Step 3 : remove cycle 
        prev.next = null;
    }
    public static void main(String[] args) {
       head = new Node(1);
       Node temp = new Node(2);
       head.next = temp;
       head.next.next = new Node(3);
       head.next.next.next = temp;
       removeCycle();
       System.out.println("LL After removing cycle");
       printLL(head);


    }
    
}
