package Assignment;

public class array2d1 {
    //Print the number of 7’s that are inthe 2d array
    public static void main(String[] args) {
        int count=0;
        int[][] array = {{4,7,8}, {8,8,7}};
         for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}        
