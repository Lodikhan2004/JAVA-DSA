package Stacks;

import java.util.Stack;
public class StockSpan {
    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=1; i<stocks.length; i++){
            int currPrice = stocks[i];                            //ex: 60 < 70
            while(!s.isEmpty() && stocks[s.peek()] <= currPrice){ //if prev price < curr price pop
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1; // if no high price 
            }
            else{
                int prevHigh = s.peek(); // high index
                span[i] = i - prevHigh;  // calculate span
            }
            //push the index of curprice after calculating span
            s.push(i);

        }
    }
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stockSpan(stocks,span);

        for(int i=0; i<span.length; i++)  {
            System.out.println(span[i] + " ");
        }
    }
    
}
