public class PainterPainting {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int k = 2;
        int result = painter(arr, k);
        System.out.println(result);
    }
    public static int painter(int arr[], int k) {
        int low = 0;
        int high = 0;
        for(int i = 0; i < arr.length; i++) {
            high += arr[i];
            low = Math.max(low, arr[i]);
        }
        int result = 0;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(isPossible(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    public static boolean isPossible(int arr[], int k, int mid) {
        int painter = 1;
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(sum + arr[i] <= mid) {
                sum += arr[i];
            } else {
                sum = arr[i];
                painter++;
            }
            if(painter > k) {
                return false;
            }
        }
        return true;
    }
    
}
