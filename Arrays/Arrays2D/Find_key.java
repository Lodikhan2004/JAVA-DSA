package Arrays.Arrays2D;
import java.util.Scanner;
public class Find_key{
    public static boolean search(int matrix[][],int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key elem found at index: ("+i+","+j+")");
                    return true; 
                }
            }
        }
        System.out.println("Element not found!");
        return false;

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
        System.out.println("Enter the search element:");
        int key=sc.nextInt();
        System.out.println(search(matrix, key));
        sc.close();
    }
    
}
