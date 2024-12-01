package Arrays.Arrays2D;
import java.util.Scanner;
public class Largest_Smallest {

     public static void largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                largest = Math.max(matrix[i][j], largest);
            }
        }
        System.out.println("Largest number is : "+ largest);
     }

     public static void smallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
               smallest = Math.min(matrix[i][j], smallest);
            }
        }
        System.out.println("Smallest number is : "+smallest);
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
        largest(matrix);
        smallest(matrix);
        sc.close();
    }
    
    
}
