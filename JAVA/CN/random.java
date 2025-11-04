package CN;

import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of packets to be sent: ");
        int n = sc.nextInt();
        System.out.println("Enter the window size: ");
        int windowSize = sc.nextInt();
        System.out.println("Enter the frequency of packet loss: ");
        int feqOfPacketLoss = sc.nextInt();
        System.out.println("\nTotal number of transmission: "+ GBN(n,windowSize,feqOfPacketLoss));
    }

    public static int GBN(int n,int windowSize,int feqOfPacketLoss){
        int left = 0;
        int right = 0;
        int packetCount = 0;
        List<Integer> list = new ArrayList<>();
        while(left < n){
            packetCount++;
            if(right < n){
                list.add(right + 1);
                System.out.println("packet " + (right + 1) + " sent");
                right++;
            }
            if(feqOfPacketLoss != 0 && (packetCount - windowSize + 1) != 0 && (packetCount - windowSize + 1 )  % feqOfPacketLoss == 0 ) {
                System.out.println("acknowledgement of packet " + (left + 1) + " not received X");
                right = left;
            }
            if(right - left + 1 > windowSize || right >= n){
                System.out.println("acknowledgement of packet " + (left + 1) + " received `/");
                left++;
            }

        }
        for(int i : list){
            System.out.print(i + " ");
        }
        return list.size();
    }
}