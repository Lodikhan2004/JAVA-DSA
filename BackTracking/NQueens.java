package BackTracking;

public class NQueens {
    static int count =0;
    public static boolean isSafe(char board[][],int row, int col){
        // Vertical up
        for(int i=row -1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //Diagonal left up
        for(int i=row-1 , j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //Diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueen(char board[][],int row){
        
        //Base Case
        if(row == board.length){
           // printBoard(board);
            count++;
            return;
        }
        //Column loop
        for(int j=0; j<board[0].length; j++){
            if(isSafe( board ,  row,  j)){// Check if it is safe to place Queen
                board[row][j] = 'Q';
                nQueen(board, row+1); //Recursion
                board[row][j] = 'x'; //Back Tracking
            }

        }
    }

    //Print 1 Solution for N Queen
    public static boolean nQueen1sol(char board[][],int row){
        
        //Base Case
        if(row == board.length){
            return true;
        }
        //Column loop
        for(int j=0; j<board[0].length; j++){
            if(isSafe( board ,  row,  j)){// Check if it is safe to place Queen
                board[row][j] = 'Q';
                if(nQueen1sol(board, row+1)){
                    return true;
                } 
                board[row][j] = 'x'; //Back Tracking
            }

        }
        return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("-------------Chess Board--------------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }    
    }
    
    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];
        //Initialize board
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                board[i][j] = 'x';
            }
        } 
        nQueen(board, 0);
        System.out.println("Total number of ways to solve n queens :" + count);

        //Printing 1 solution
        if(nQueen1sol(board, 0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }
         
    }
    
}
