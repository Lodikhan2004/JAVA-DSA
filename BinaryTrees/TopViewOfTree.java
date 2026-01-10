package BinaryTrees;

import java.util.*;
public class TopViewOfTree {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    //Info class will store node + horizontal distance
    static class Info{
        Node node;
        int hd;
        Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    //Top view
    public static void topView(Node root){
        //Level order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>(); // <hd, node>

        int min=0, max=0;
        q.add(new Info(root, 0)); // add root node and hd as 0 in the queue
        q.add(null); // then add null

        while(!q.isEmpty()){ // until queue is not empty
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){ // if node is null and queue is also empty then stop
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.hd)){ //check if hd (key) does not exist in map then add the key and node
                    map.put(curr.hd, curr.node); //store key and value (value is only node not Info)
                }

                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd - 1));// add only node from curr and calculate hd
                    min = Math.min(min, curr.hd-1);

                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd + 1)); //add only node from curr and calculate hd
                    max = Math.max(max, curr.hd+1);
                }
            }
        }

        //print
        for(int i=min; i<= max; i++){
            System.out.print(map.get(i).data +" ");
        }

    }
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        topView(root);
    }
    
}
