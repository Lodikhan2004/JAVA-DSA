package BST;

public class BuildBST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static Node Build_BST(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.data){
           root.left =  Build_BST(root.left, val);
        }
        if(val > root.data){
            root.right = Build_BST(root.right, val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void main(String args[]){
        int val[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0; i<val.length; i++){
            root = Build_BST(root, val[i]);
        }
        inOrder(root);
    }
    
}
