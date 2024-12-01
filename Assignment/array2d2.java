package Assignment;

public class array2d2 {
    public static void main(String[] args) {
        int Sum=0;
        int[][] array = { {1,4,9},{11,4,3},{2,2,3} };
         /*for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(i==1){
                    Sum += array[i][j];
                }
            }
        }
        System.out.println(Sum);*/
        int j=0;
        int i=1;
        while(j<array[0].length){
            Sum += array[i][j];
            j++;
        }
        System.out.println(Sum);
    
}
}
