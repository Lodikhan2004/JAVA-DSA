package Additional_Concept;
import java.util.*;
public class D2arrays {

    public static int searchIn2D(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                largest = Math.max( largest, matrix[i][j]);
            }
        }
        return largest;


    }
    public static void printSpiral(int matrix[][]){
        int n= matrix.length;
        int m = matrix[0].length;
        int startRow =0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = m-1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j=startCol; j<= endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right 
            for(int i=startRow + 1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            // left
            for(int i=endRow-1; i>= startRow+1; i-- ){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;

        }
        System.out.println();
    }
    public static int diagnolSum(int matrix[][]){
        //primary diagnol
        int sum =0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i==j){
        //             sum = sum +matrix[i][j];
        //         }
        //         else if( i+j == (matrix.length -1)){
        //             sum= sum+ matrix[i][j];

        //         }
        //     }
        // }
        // return sum;

     
        for(int i=0; i< matrix.length ; i++){
            
                sum = sum + matrix[i][i];
            if( i != matrix.length-1-i){
                sum= sum+ matrix[i][matrix.length-1-i];
            }
             

        }
        return sum;
    }

    public static boolean stairCase(int matrix[][], int key){
    
        int n= matrix.length;
        int m=matrix[0].length;
        int row =0 , col = m-1;
        while( row <= n-1 && col >= 0){
            if(matrix[row][col]==key){
                System.out.print("Element found at index " +row +"," + col);
                return true;
            }
            else if(key < matrix[row][col] ){
                col--;
                
            }else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
         int matrix[][] = new int[4][4];
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the matrix :");
         for(int i=0; i< 4; i++){
            for(int j=0; j<4; j++){
                matrix[i][j]  = sc.nextInt();
            }
         }
         //print
         System.out.println("Matrix :");
         for(int i=0; i< 4; i++){
            for(int j=0; j<4; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
         }
       stairCase(matrix, 33);
    }
    
    
}
