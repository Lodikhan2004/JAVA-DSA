package Arrays.Arrays2D;

import java.util.Scanner;

public class DiagonalSum {

    public static int diagonalSum(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int Sum=0;
       /* for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                //add primary diagonal
                if(i == j){    
                    Sum += matrix[i][j];
                }
                //add secondary diagonal
                else if(i + j == n-1){
                    Sum += matrix[i][j];
                }
            }
        }
        return Sum;      
        TIME COMPLEXITY ==> O(n**2)
        */ 
        for(int i=0; i<n; i++){
            //pri diagonal
            Sum += matrix[i][i];

            //sec diagonal
            int j=n-1-i;    //i+j =n-1 ==> j=n-1-i
            if(i != j){ 
                Sum += matrix[i][j];
            }
        }
        return Sum;
        //TIME COMPLEXITY ==>O(n)
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        //n= matrix.length , m= matrix[0].length
        int matrix[][]=new int[n][m];
        Scanner sc =new Scanner(System.in);
        //input
        System.out.println("Enter the matrix:");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        System.out.println("GIVEN MATRIX");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
       System.out.println(diagonalSum(matrix));
       
        sc.close();
    }
    
}
