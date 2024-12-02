package Assignment;
import java.util.Scanner;
public class Transpose2D {
    //Write a program to FindTransposeofa Matrix.
    //Transpose of a matrix is the process
    // of swapping the rows to columns. For a 2x3 matrix
    public static void transpose(int arr[][]){
        //For a 2x3 matrix
        int transpose[][]=new int[arr[0].length][arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        //print
        System.out.println("Transpose :");
        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }


    }
    public static void main(String[] args){
        int n=2;
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
        transpose(matrix);
       
        sc.close();

    }
    
}
