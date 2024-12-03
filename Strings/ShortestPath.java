package Strings;

import java.util.Scanner;

public class ShortestPath {
    public static void shortestPath(String str){
        int x=0,y=0;
        for(int i=0; i<str.length(); i++){
            
            switch (str.charAt(i)) {
                case 'N': y++;
                          break;
                case 'S': y--;
                          break;
                case 'E': x++;
                          break;
                case 'W': x--;
                          break;            
                default:
                    break;
            }
        }
        int x1 = 0;
        int y1 = 0;
        int x2 = x;
        int y2 = y;
        //calculate distance 
        int r1 = x2 - x1;
        int r2 = y2 -y1;
        double dis =Math.sqrt(Math.pow(r1, 2) + Math.pow(r2, 2));
        System.out.println(dis);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER A STRING");
        String str=sc.nextLine();
        shortestPath(str);
       
        
        sc.close();
    }
    
}
