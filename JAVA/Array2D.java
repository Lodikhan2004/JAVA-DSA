import java.util.Scanner;
public class Array2D {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row=sc.nextInt();
        System.out.println("Enter no of columns:");
        int col=sc.nextInt();
        int matrix[][]=new int[row][col];
        System.out.println("Enter the matrix:");
        //ACCEPT ARRAY ELEMENT
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
        //DISPLAY MATRIX
        System.out.println("Matrix elements:");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
