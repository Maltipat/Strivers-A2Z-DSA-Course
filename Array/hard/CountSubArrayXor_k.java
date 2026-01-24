import java.util.HashMap;
public class CountSubArrayXor_k {

    public static int countSubArrayXor(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
            if (map.containsKey(xor ^ k)) {
                count += map.get(xor ^ k);
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        int result = countSubArrayXor(arr, k);
        System.out.println(result);
    }
}
