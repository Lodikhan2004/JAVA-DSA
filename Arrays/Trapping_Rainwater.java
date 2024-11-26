package Arrays;
import java.util.Scanner;
public class Trapping_Rainwater {

    public static int trappedWater(int height[]){
        int n=height.length;
        //Leftmax Boundary
        int leftmax[]=new int[n];
        leftmax[0] = height[0];
        for(int i=1;i<n;i++){
            leftmax[i]= Math.max(height[i] , leftmax[i-1]);
        }
        //Rightmax Boundary
        int rightmax[] =new int[n];
        rightmax[n-1] =height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i] , rightmax[i+1]);
        }
        //Loop
        int Trappedwater=0;
        for(int i=0; i<n; i++){
            //WaterLevel =min(Leftmax Boundary,Rightmax Boundary)
            int waterlevel= Math.min(leftmax[i],rightmax[i]);

            //Trapped water = (WaterLevel - Height) * width
            Trappedwater +=waterlevel - height[i];
        }
        return Trappedwater;    
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of  bars:");
        int n=sc.nextInt();
        int height[]=new int[n];
        System.out.println("Enter the height of each bar:");
        for(int i=0;i<height.length;i++){
            height[i]=sc.nextInt();
        }
        System.out.println("TRAPPED WATER : " + trappedWater(height));
        sc.close();   
    }
    
}
