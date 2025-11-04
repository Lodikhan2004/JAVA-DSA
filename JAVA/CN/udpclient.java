package CN;

import java.net.*;


public class udpclient {
    public static void main(String[] args) {
        try {
            DatagramSocket client = new DatagramSocket(); // Create a DatagramSocket for the client
            int serverSocket = 1537; // Server port number
            InetAddress host = InetAddress.getByName("127.0.0.1"); // Server address (localhost)

            String message = "Text Message"; // Message to be sent to the server
            byte[] sendMessage = message.getBytes(); // Convert the message to bytes
            DatagramPacket request = new DatagramPacket(sendMessage, sendMessage.length, host, serverSocket); // Create a DatagramPacket to send the message
            client.send(request); // Send the request to the server

            byte[] buffer = new byte[1000]; // Buffer to receive the server's reply
            DatagramPacket reply = new DatagramPacket(buffer, buffer.length); // DatagramPacket to receive the reply
            client.receive(reply); // Wait for the reply from the server

            System.out.println("Client received:\n " + new String(reply.getData())); // Print the reply from the server

            client.close(); // Close the client socket
        } catch (Exception ex) {
            ex.printStackTrace(); // Print any exceptions
        }
    }
}

