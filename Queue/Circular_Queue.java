package Queue;

public class Circular_Queue {
    public static class Queue{
        static int arr[];
        public static int size;
        public static int rear;
        public static int front;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        //isEmpty
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        //isFull
        public static boolean isFull(){
            return (rear + 1) % size == front;
        }

        //add
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            //Adding First Elem
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];

            if(front == rear){ // Deleting the last elem
                front = rear = -1;
            } else {
                front = (front + 1)% size; // normal updation
            }
            return result;

        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front]; // front element
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
