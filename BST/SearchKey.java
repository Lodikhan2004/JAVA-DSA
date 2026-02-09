package BST;

import Additional_Concept.primenumber;

public class SearchKey {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    
    public static Node BuildBST(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.data){
            root.left = BuildBST(root.left, val);
        }else{
            root.right = BuildBST(root.right, val);
        }
        return root;
    }
    public static boolean search_key(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(key < root.data){
            return search_key(root.left, key);
        }
        else{
            return search_key(root.right, key);
        }
        
    }
    public static void main(String[] args) {
        Node root = null;
        int val[] ={5,1,3,4,2,7};
        for(int i =0; i<val.length; i++){
            root = BuildBST(root, val[i]);
        }
        if(search_key(root, 10)){
            System.out.println("Key found");
        }
        else{
            System.out.println("Key not found");
        }
    }
}
