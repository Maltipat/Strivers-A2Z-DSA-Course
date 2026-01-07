import java.util.*;

public class union {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 7};

        int result[] = unionArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            set.add(num);
        }

        int[] union = new int[set.size()];
        int i = 0;
        for (int num : set) {
            union[i++] = num;
        }
        return union;
    }
}
