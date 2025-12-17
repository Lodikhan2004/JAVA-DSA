package Queue;

public class Queue_LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Queue{
        public static Node head ;
        public static Node tail ;

        public static boolean isEmpty(){
            //isEmpty
            return head == null;
        }
        //Enqueue => addLast
        public static void Enqueue(int data){
            
            //create node
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //Dequeue => removeFirst
        public static int Dequeue(){
            
            //isEmpty
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = head.data;
            //single node
            if(head.next == null){
                head = tail = null;   
                 
            }else{
                head = head.next;
            }
            return result;
 
        }
        public static int peek(){
            
            //isEmpty
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;

        }
        public static void main(String[] args) {
            Queue q = new Queue();
            q.Enqueue(1);
            q.Enqueue(2);
            q.Enqueue(3);
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.Dequeue();
            }
            
        }
    }
    


}
