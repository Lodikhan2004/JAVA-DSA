package Arrays.Arrays2D;

import java.util.Scanner;

public class Search_In_Sorted_Matrix {
    public static boolean staircaseSearch(int matrix[][], int key){
        int n=matrix.length , m= matrix[0].length;
        int row = 0, col=m-1;
        while(row <= n-1 && col>=0){
            if(matrix[row][col] == key){
                System.out.println("Key found at index : (" + row + "," + col +")");
                return true;
            }

            if(key < matrix[row][col]){
                col--;
            }
            
            else if(key > matrix[row][col]){
                row++;
            }

        }
        System.out.println("KEY NOT FOUND!");
        return false;
    }
     public static void main(String[] args) {
        int n=4;
        int m=4;
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
        System.out.println("Enter the search element:");
        int key=sc.nextInt();
        System.out.println(staircaseSearch(matrix, key)); 
        sc.close();
    }
    
    
}
