package CN;



import java.util.Scanner;

public class bell {
    // Declare static variables
    static int n, dest; // Number of nodes and destination vertex
    static double[] prevDistanceVector, distanceVector; // Arrays to store distance vectors
    static double[][] adjacencyMatrix; // 2D array to store adjacency matrix

    public static void main(String[] args) {
        // Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of nodes
        System.out.println("Enter number of nodes");
        n = scanner.nextInt();
        
        // Initialize adjacency matrix
        adjacencyMatrix = new double[n][n];
        
        // Read the adjacency matrix
        System.out.println("Enter Adjacency Matrix (Use 'Infinity' for No Link)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjacencyMatrix[i][j] = scanner.nextDouble();
            }
        }
        
        // Read the destination vertex
        System.out.println("Enter destination vertex");
        dest = scanner.nextInt();
        
        // Initialize distance vector
        distanceVector = new double[n];
        for (int i = 0; i < n; i++) {
            distanceVector[i] = Double.POSITIVE_INFINITY;
        }
        distanceVector[dest - 1] = 0; // Distance to the destination vertex is 0
        
        // Run the Bellman-Ford algorithm
        bellmanFordAlgorithm();
        
        // Print the distance vector
        System.out.println("Distance Vector");
        for (int i = 0; i < n; i++) {
            if (i == dest - 1) {
                continue; // Skip the destination vertex
            }
            System.out.println("Distance from " + (i + 1) + " is " + distanceVector[i]);
        }
        System.out.println();
        
        // Close the scanner
        scanner.close();
    }

    static void bellmanFordAlgorithm() {
        // Run the Bellman-Ford algorithm for n-1 iterations
        for (int i = 0; i < n - 1; i++) {
            // Clone the distance vector to the previous distance vector
            prevDistanceVector = distanceVector.clone();
            
            // Relax all edges
            for (int j = 0; j < n; j++) {
                double min = Double.POSITIVE_INFINITY;
                for (int k = 0; k < n; k++) {
                    // Find the minimum distance
                    if (min > adjacencyMatrix[j][k] + prevDistanceVector[k]) {
                        min = adjacencyMatrix[j][k] + prevDistanceVector[k];
                    }
                }
                // Update the distance vector
                distanceVector[j] = min;
            }
        }
    }
}
