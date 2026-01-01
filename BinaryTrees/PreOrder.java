package BinaryTrees;

public class PreOrder {
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

    //Pre order Traversal
    public static void preOrder(Node root){
        //Base Case
        if(root == null){ //if we try to access the leaf nodes left or right or root is only empty return from there
            //System.out.print(-1 +" ");
            return;
        }

        
        //print root
        System.out.print(root.data + " ");

        //left subtree
        preOrder(root.left);

        //right subtree
        preOrder(root.right);

    }
    
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = buildTree(nodes);
        preOrder(root);
    }
    
}
