package CN;


import java.net.*;
import java.util.*;

public class udpser {
    public static void main(String[] args) {
        try {
            DatagramSocket server = new DatagramSocket(1537); // Create a DatagramSocket to listen on port 1537

            System.out.println("Enter server message:");
            Scanner scan = new Scanner(System.in); // Scanner for reading server input

            while (true) {
                byte[] buffer = new byte[1000]; // Buffer to receive incoming datagrams
                DatagramPacket request = new DatagramPacket(buffer, buffer.length); // DatagramPacket to receive the request
                server.receive(request); // Wait for a client request and receive it

                String message = scan.nextLine(); // Read a line of input from the server console
                byte[] sendMessage = message.getBytes(); // Convert the message to bytes
                DatagramPacket reply = new DatagramPacket(sendMessage, sendMessage.length, request.getAddress(), request.getPort()); // Create a DatagramPacket to send the reply
                server.send(reply); // Send the reply to the client

                server.close(); // Close the server socket (this will terminate the server, should be moved outside of while loop for continuous running)
                scan.close(); // Close the scanner (should also be moved outside of while loop)
            }
        } catch (Exception ex) {
            ex.printStackTrace(); // Print any exceptions
        }
    }
}

