package BinaryTrees;

public class Diameter {
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
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int totalHeight = Math.max(lh, rh) +1;
        return totalHeight;
    }
    //Diameter
    public static int diameterOfTree2(Node root){ // O(n^2)
        if(root == null){
            return 0;
        }
        int ldiam = diameterOfTree2(root.left);
        int lht = height(root.left);
        int rdiam = diameterOfTree2(root.right);
        int rht = height(root.right);

        int selfdiam = lht + rht + 1; //through root

        int totalDiam = Math.max(selfdiam, Math.max(ldiam,rdiam));
        return totalDiam;
    }
    static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht ){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){ //O(n)
        if(root == null){
            return new Info(0, 0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam , rightInfo.diam ), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }
    
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = buildTree(nodes);
        System.out.println(diameter(root).diam);

    }
    
}
