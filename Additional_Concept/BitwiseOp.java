package Additional_Concept;

public class BitwiseOp {
    public static int getith(int n , int i){
        
        int bitmask = 1<<i;
        if( (n & bitmask) == 0 ){
             return 0;
        }
        else{
           return 1;
        }
    }
    public static int  setith(int n , int i){
        int bitmask = 1<<i;
        return n | bitmask;

    }
     public static int  clearith(int n , int i){
        int bitmask = ~(1<<i);
        return n & bitmask;

    }
    public static int clearlastibits(int n, int i){
        int bitmask = n<<i;
        return n & bitmask;
    }
    public static void updateith(int n, int i, int val){
        if(val == 1){
            System.out.println(setith(n, i));
        }
        else{
            System.out.println(clearith(n, i));
        }

    }  
    public static int clearbitsrange(int n,int i , int j){
        int a =((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }
    public static void  powerof2(int n){
        if( (n & n-1) == 0){
             System.out.println(n+ " is power of 2");
        }else{
            System.out.println("false");
        }
    }
    public static int countsetbits(int n){
        int count =0;
        while(n>0){
            if((n & 1) != 0 ){
                count++;
            }
            n= n>>1;
        }
        return count;
    }
    public static int fastExpo(int a, int n){
        int ans=1;
        while(n>0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            
            a = a*a;
            n = n>>1;

        }
        return ans;

    }
    public static void cha(){
        String str[] ={"flower","flow"};

        System.out.println(str[0].charAt(0));;
    }
      public static void main(String arg[]){
        cha();
        System.out.println(fastExpo(3, 5));
        System.out.println("number of set bits :"+ countsetbits(16));
        // powerof2(4);
        // System.out.println(clearbitsrange(10, 2, 4));
        // System.out.println(clearlastibits(15, 2));
    //    updateith(10, 2, 1);
        
        // System.out.println(clearith(10, 1));
        // System.out.println(setith(10, 2));
        // System.out.println(getith(10, 3));
       
    }
    
}
