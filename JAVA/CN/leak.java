package CN;



import java.util.Scanner;

public class leak {
    public static void main(String[] args) {
        // Prompt the user to enter the number of time intervals
        System.out.println("Enter the number of time intervals: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of time intervals

        int[] t = new int[n]; // Array to store the time intervals
        System.out.println("Enter the time intervals: ");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt(); // Reading each time interval
        }

        // Prompt the user to enter the injection rate and leak rate
        System.out.println("Enter injection rate (i) and leak rate (l): ");
        int i = sc.nextInt(); // Injection rate
        int l = sc.nextInt(); // Leak rate

        int lct = t[0]; // Initialize last checked time to the first time interval
        int x = 0; // Initialize current bucket content to 0
        int y = 0; // Variable to store bucket content after leakage

        for (int j = 0; j < n; j++) {
            // Calculate the new bucket content after accounting for leakage
            y = x - (t[j] - lct);
            
            // Check if the new bucket content exceeds the leak rate
            if (y > l) {
                System.out.println("Nonconforming packet at time interval " + t[j]);
            } else {
                x = y + i; // Update bucket content by adding injection rate
                lct = t[j];
                System.out.println("Conforming packet at time interval " + t[j]);
            }

            // Update the last checked time to the current time interval
        }

        sc.close(); // Close the scanner
    }
}

