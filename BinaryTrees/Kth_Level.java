package BinaryTrees;
import java.util.*;
public class Kth_Level {
    static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static void Kth_level(Node root){ //O(n)
        if(root == null){ // Tree empty
            return;
        }
        Queue<Node> q = new LinkedList<>(); // we will be storing nodes not node.data
        int Level = 1;
        int k =3;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curNode = q.remove();
            if(curNode == null){ // check if curnode is null and queue is  empty
                //System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{ // curNode is null but queue is not empty then add null
                    q.add(null);
                    Level ++;
                }
            }
            else { // curNode is not null 
                if(Level == k){
                    System.out.print(curNode.data + " "); 
                    
                }
                //print node
                if(curNode.left != null){ //add left node 
                    q.add(curNode.left);
                }
                if(curNode.right != null){ //add right node
                    q.add(curNode.right);
                }
            }
        }

    }
    
    public static void KthLevelOfTree(Node root,int level,int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data+" ");
            return;
        }
        KthLevelOfTree(root.left,level +1 , k);
        KthLevelOfTree(root.right, level+1, k);
        
    }
    public static void main(String arg[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        KthLevelOfTree(root, 1, 2);
        Kth_level(root);
        
    }
    
}

