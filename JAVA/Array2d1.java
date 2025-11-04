import java.util.Scanner;

public class Array2d1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row=sc.nextInt();
        System.out.println("Enter no of columns:");
        int col=sc.nextInt();
        System.out.println("Enter the matrix:");
        int matrix[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the search element:");
        int elem=sc.nextInt();
        sc.close();
        //COMPARE
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==elem){
                    System.out.println("ELEMENT "+ elem + " FOUND AT POSITION "+"("+i+","+j+")");
                    return;
                }
                
            }
        } 
        System.out.println("Elem "+ elem +" not found");
        
    }
    
}
