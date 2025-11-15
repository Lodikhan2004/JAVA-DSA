package Recursion;

public class TowerOFHanoi {
    public static void tower(int n,String src,String helper,String dest){
        if(n == 1){
            System.out.println("Transfer Disk "+n+" From "+src+" To " +dest);
            return;
        }
        tower(n-1, src, dest, helper);
        System.out.println("Transfer Disk "+n+" From "+src+" To " +dest);
        tower(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n =3;
        tower(n, "S", "H", "D");
        
    }

    
}
