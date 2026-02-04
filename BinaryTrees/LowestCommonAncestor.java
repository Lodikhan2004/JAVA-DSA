package BinaryTrees;
import java.util.*;
public class LowestCommonAncestor {
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
    public static boolean getpath(Node root, int n, ArrayList<Node> list){
        if(root == null){
            return false;
        }
        list.add(root);

        if(root.data == n){
            return true;
        }
        boolean foundLeft =  getpath(root.left, n, list);
        boolean foundRight = getpath(root.right, n, list);

        if(foundLeft || foundRight){
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }
    public static Node lca(Node root, int n1 , int n2 ){
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();
        //find path
        getpath(root, n1 , list1);
        getpath(root, n2 , list2);

        //last common ancestor
        int i =0;
        for(; i<list1.size() && i < list2.size(); i++){
            if(list1.get(i) != list2.get(i) ){
                break;
            }
        }
        Node lca = list1.get(i-1);
        return lca;
        
    }
    public static void main(String arg[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(lca(root, 4, 5).data);

        
        
    }
    
}
