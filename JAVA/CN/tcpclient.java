package CN;

import java.net.*; 
import java.io.*;

public class tcpclient { 
    public static void main(String[] args) { 
        try { 
            Socket client = new Socket("localhost", 1537); // Connect to the server at localhost:1537
            BufferedReader k = new BufferedReader(new InputStreamReader(System.in)); // Get user input for file name
            System.out.println("Enter file location:"); 
            String filename = k.readLine(); // Read the file name from the user
            DataOutputStream sendToServer = new DataOutputStream(client.getOutputStream()); // Output stream to send data to the server
            sendToServer.writeBytes(filename + "\n"); // Send the file name to the server

            BufferedReader i = new BufferedReader(new InputStreamReader(client.getInputStream())); // Input stream to read the server's response
            String string = i.readLine(); // Read the server's response (Yes or No)
            if(string.equals("Yes")) { // File exists
                while((string = i.readLine()) != null) { // Read the file content sent by the server
                    System.out.println(string); // Print each line of the file content
                }
            } else { // File doesn't exist
                System.out.println("File not found"); 
            }

            // Close resources
            k.close(); 
            client.close(); 
            sendToServer.close(); 
            i.close(); 
        } catch(Exception ex) {
            ex.printStackTrace(); // Catch and print any exceptions
        } 
    } 
}

