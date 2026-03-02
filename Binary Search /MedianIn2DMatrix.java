public class BinarySearchMedianSimple {

    public static int countInRow(int[] row, int target) {
        int start = 0;
        int end = row.length - 1;
        
        while (start <= end) {
            int middle = (start + end) / 2;
            
            if (row[middle] <= target) {
                // This number is small enough, go RIGHT
                start = middle + 1;
            } else {
                // Too big, go LEFT
                end = middle - 1;
            }
        }
        // start = count of numbers ≤ target
        return start;
    }
    
    public static int findMedian(int[][] matrix) {
        // Step 1: Find smallest (low) and largest (high)
        int low = matrix[0][0];
        int high = matrix[0][matrix[0].length - 1];
        
        // Check all rows to find true min and max
        for (int i = 1; i < matrix.length; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][matrix[0].length - 1]);
        }
        
        // How many numbers must be ≤ median?
        // For 9 numbers, we need at least 5
        int needed = (matrix.length * matrix[0].length + 1) / 2;
        
        // Step 2: Binary Search!
        while (low < high) {
            int mid = (low + high) / 2;
            
            // Count ALL numbers ≤ mid in the whole matrix
            int count = 0;
            for (int[] row : matrix) {
                count += countInRow(row, mid);
            }
            
            // Decide: is median bigger or smaller?
            if (count < needed) {
                // Not enough numbers ≤ mid, median is BIGGER
                low = mid + 1;
            } else {
                // Enough numbers, median is SMALLER or EQUAL
                high = mid;
            }
        }
        
        // low == high == median!
        return low;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 9},
            {3, 6, 8},
            {5, 7, 10}
        };
        
        System.out.println("Median = " + findMedian(matrix));
    }
}
