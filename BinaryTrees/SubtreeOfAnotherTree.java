package BinaryTrees;

public class SubtreeOfAnotherTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //2.Check for identical or not 
    public static boolean isIdentical(Node node, Node subRoot){
        if(node == null && subRoot == null){
            return true; // both are null so identical
        }
        else if(node == null || subRoot == null || node.data != subRoot.data){
            return false; // either has become null or data doesnt match then not identical
        }

        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }

        return true;
    }
    //1.Find subRoot in tree 
    public static boolean isSubtree(Node root , Node subRoot){
        //Base case 
        if(root == null){ // if tree is empty or reaches leaf child then subtree will not exist
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        
    }
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }

    
}
