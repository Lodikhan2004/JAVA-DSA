package Additional_Concept;
import java.util.*;

public class basic {
    public static int mul(int a , int b){
        int prod = a*b;
        return prod;
        
    }
    public static int factorial(int n){
        int fact =1;
        for (int i =n; i>=1 ; i--){
            fact = fact*i;  
        }
        return fact;
    }

    public static double bino(int n, int r){
        int nfac = factorial(n);
        int rfac = factorial(r);
        int nrfac = factorial(n -r );
        double ncr = nfac / (rfac * nrfac);
        return ncr;

    }

    public static int sum(int a , int b ){
        return a+b;
    }
    public static float sum(int a , int b ,float c){
        return a+b+c;
    }



    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n %i == 0){
                return false;
            }
        }
        return true;

    }
    public static void printPrime(int n){
        for (int i = 2; i<=n; i++){
     
            if(isPrime(i)){
                System.out.println(i);

            }  
        }
    }
    public static int bintodec(int n){
        int dec =0;
        int pow =0;
        while(n> 0){
           int  lastdig = n % 10;
           dec = dec + lastdig * ((int)Math.pow(2, pow));
           pow++;
           n = n / 10;
        }
        return dec;
    }

    public static int dectobin(int n){
        int bin =0;
        int pow =0;
        while(n > 0){
            int rem = n % 2 ;
            bin = bin + (rem *(int) Math.pow(10, pow));
            pow ++;
            n = n /2;

        }
        return bin;
    }

    public static void hollow(int n, int m){
        for(int i = 1 ; i<=n ; i++){
            for(int j=1; j<=m; j++){
                if( i==1 || i== 4 || j == 1 || j == 5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    public static void invpyramid(int n){
        for (int i =1; i<=n ; i++){
            for(int j=1; j<=n-i; j++){
              System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numpy(int n){
     
        for (int i = 1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
               
            }System.out.println();
        }
    }

    public static void floyds(int n){
        int counter=1;
        for(int i =1 ; i<=n; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(counter +" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void O_1tri(int n){

        for(int i =1 ; i<=n; i++){
            for(int j= 1; j<=i; j++){
                if((i+j)%2 ==0 ){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }  
               
            }
            System.out.println();
        }

    }
    
    public static void butterfly(int n){
        for (int i =1; i<= n; i++){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            for(int k=1; k<= 2*(n-i); k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //second half
         for (int i =n; i>= 1; i--){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            for(int k=1; k<= 2*(n-i); k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void solidrhom(int n){
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowrhom(int n){
       for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
               for(int j=1; j<=n; j++){
                if(i==1 || i==5 || j==1|| j==5 ){
                    System.out.print("*");
                }else{  
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamon(int n){
       for (int i=1; i<=n; i++){
        for(int j=1; j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1; k<=2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
       }

       for (int i=n; i>=1; i--){
        for(int j=1; j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1; k<=2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
       }

    }
    public static void main(String[] args) {
        diamon(4);
        hollowrhom(5);
        solidrhom(4);
        butterfly(5);
        O_1tri(5);
        floyds(5);
        numpy(5);
        invpyramid(4);
        hollow(4, 5);


       // System.out.println("dec to bin is :" + dectobin(7));
    //System.out.println("binary to dec is :" + bintodec(110));      
      
    }       
}
    

