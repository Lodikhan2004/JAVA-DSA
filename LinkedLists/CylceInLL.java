package LinkedLists;

public class CylceInLL {
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
    //Floyd's cycle finding algorithm
    public static boolean isCycleInLL(){
        Node slow, fast;
        slow = head;
        fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){ // slow and fast meet at same point
                return true;// cycle exists
            }
        }
        return false;// cycle doesn't exist
    }

    public static void main(String[] args) {
       head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = head;

       if(isCycleInLL()){
        System.out.println("Cycle Exists");
       }else{
        System.out.println("Cycle doesnt exists");
       }
       
    }
  
}

