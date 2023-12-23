import java.util.HashSet;

// Class to represent a coordinate point (x, y) on the 2D plane
class Pair {
    int x;
    int y;

    // Constructor to initialize x and y coordinates
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Override equals method to compare Pair objects based on their coordinates
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check for self-comparison
        if (obj == null || getClass() != obj.getClass()) return false; // Check for type mismatch
        Pair pair = (Pair) obj; // Cast obj to Pair for comparison
        return x == pair.x && y == pair.y; // Compare x and y values
    }

    // Override hashCode method for efficient storage in HashSet
    @Override
    public int hashCode() {
        // Combine x and y values for a unique hash code
        return Objects.hash(x, y);
    }
}

class Solution {
    // Method to determine if a path crosses itself
    public boolean isPathCrossing(String path) {
        int x = 0;  // Initialize starting x-coordinate at origin
        int y = 0;  // Initialize starting y-coordinate at origin
        HashSet<Pair> visited = new HashSet<>();  // Create a HashSet to store visited coordinates
        visited.add(new Pair(0, 0));  // Add the origin as initially visited

        // Iterate through each character in the path string
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);  // Get the current direction

            // Update coordinates based on the direction
            if (direction == 'N') {
                y++;
            } else if (direction == 'S') {
                y--;
            } else if (direction == 'E') {
                x--;  // Note: x-axis is commonly reversed in programming coordinates
            } else if (direction == 'W') {
                x++;
            }

            // Create a Pair object representing the current coordinates
            Pair currentPair = new Pair(x, y);

            // Check if the current Pair has already been visited
            if (visited.contains(currentPair)) {
                return true;  // Path crosses itself, return true
            }

            // Add the current Pair to the visited set to track it
            visited.add(currentPair);
        }

        // If the loop completes without finding a crossing, return false
        return false;  // Path does not cross itself
    }
}