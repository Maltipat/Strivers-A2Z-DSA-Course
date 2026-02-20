public class SearchInA2DMAtrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,  3,  5,  7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 23;
        boolean result = searchMatrix(arr, target);
        System.out.println(result);
    }

    public static boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        int low = 0;
        int high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m;
            int col = mid % m;
            int value = arr[row][col];
            if (value == target) {
                return true;
            } else if (value > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
    
}
