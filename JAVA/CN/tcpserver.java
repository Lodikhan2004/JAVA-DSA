package CN;

import java.net.*; 
import java.io.*;

public class tcpserver { 
    public static void main(String[] args) { 
        try { 
            ServerSocket se = new ServerSocket(1537); // Create a ServerSocket to listen on port 1537
            System.out.println("Server waiting"); 

            Socket server = se.accept(); // Accept the incoming client connection
            System.out.println("Connection established"); 

            BufferedReader k = new BufferedReader(new InputStreamReader(server.getInputStream())); // Get input from the client (file name)
            String filename = k.readLine(); // Read the file name sent by the client
            FileReader f = null; 
            BufferedReader ff = null; 
            DataOutputStream sendToClient = new DataOutputStream(server.getOutputStream()); // Create output stream to send data to the client
            File file = new File(filename); // Create a File object using the file name

            if(file.exists()) { 
                sendToClient.writeBytes("Yes\n"); // File exists, inform the client
                f = new FileReader(filename); // Open the file for reading
                ff = new BufferedReader(f); // Create BufferedReader to read the file

                String string;
                while((string = ff.readLine()) != null) // Read file line by line
                    sendToClient.writeBytes(string + "\n"); // Send each line to the client
            } else { 
                sendToClient.writeBytes("No\n"); // File doesn't exist, inform the client
            }

            // Close resources
            server.close(); 
            k.close(); 
            sendToClient.close(); 
            f.close(); 
            ff.close(); 
            se.close(); 
        } catch(Exception ex) {
            ex.printStackTrace(); // Catch and print any exceptions
        } 
    } 
}

