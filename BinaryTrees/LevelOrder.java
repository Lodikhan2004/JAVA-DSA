package BinaryTrees;

import java.util.*;

public class LevelOrder {
    //node class
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //Recursive Function to build a tree (binary)
   
    static int idx = -1; //static because at every recursion we need an updated idx not again starting from -1
    public static Node buildTree(int nodes[]){
        idx++;
        //Base case
        if(nodes[idx] == -1){
            return null;     //-1 -> null
        }
        //Create node
        Node newNode = new Node(nodes[idx]);
        //Left subtree
        newNode.left = buildTree(nodes);
        //Right subtree
        newNode.right = buildTree(nodes);

        return newNode; //Return root node

    }
    //Level Order
    public static void LevelOrder(Node root){ //O(n)
        if(root == null){ // Tree empty
            return;
        }
        Queue<Node> q = new LinkedList<>(); // we will be storing nodes not node.data
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curNode = q.remove();
            if(curNode == null){ // check if curnode is null and queue is  empty
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{ // curNode is null but queue is not empty then add null
                    q.add(null);
                }
            }
            else { // curNode is not null 
                System.out.print(curNode.data + " "); //print node
                if(curNode.left != null){ //add left node 
                    q.add(curNode.left);
                }
                if(curNode.right != null){ //add right node
                    q.add(curNode.right);
                }
            }
        }

    }
    
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = buildTree(nodes);
        LevelOrder(root);
    }
    
}
