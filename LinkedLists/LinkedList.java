package LinkedLists;

public class LinkedList {
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

    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Node newNode = new Node(1);
        Node n2 = new Node(2);
        newNode.next = n2;
        head = newNode;
        tail = n2;
        System.out.println(head.data);
        System.out.println(tail.data);

    }
    
}
