package Additional_Concept;

public class funtionoverloading{
    public static float multiply(int a,int b){
        return a*b;
    }
    
    public static float multiply(int a,int b,int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        
        float res= multiply(10,20);
        System.out.println(res);
        float res2= multiply(2,2,2);
        System.out.println(res2);
    }
    
}
