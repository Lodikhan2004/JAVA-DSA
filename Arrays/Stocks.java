package Arrays;

import java.util.Scanner;

public class Stocks {
    public static int stocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE; //INFINITY
        int maxProfit =0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit=prices[i] - buyPrice; //todays profit
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice=prices[i];
            }
           
        }
       
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of days:");
        int n=sc.nextInt();
        int prices[]=new int[n];
        System.out.println("Enter the price of each day:");
        for(int i=0;i<prices.length;i++){
            prices[i]=sc.nextInt();
        }
        System.out.println("MAXIMUM PROFIT : " + stocks(prices));
        sc.close();   
        
    }
}
