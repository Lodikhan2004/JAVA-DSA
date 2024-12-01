package Arrays.Arrays2D;

import java.util.Scanner;

public class SpiralMatrix {
    public static void printspiral(int matrix[][]){
        int n=matrix.length , m=matrix[0].length;
        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = m-1;

        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1; j>=startCol; j--){
            
                if(startRow == endRow){ //doesnt print top and bottom row elem twice
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1; i>startRow; i--){
                if(startCol == endCol){  //doesnt print right and left col elem twice
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
        printspiral(matrix);
        sc.close();
    }
    
    
}
