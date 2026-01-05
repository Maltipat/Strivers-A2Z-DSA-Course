import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,6};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }

        // Create new array with exact size
        int[] newArr = new int[hs.size()];
        int index=0;
        for (Integer k : hs) {
            newArr[index] = k;
            index++;
        }

        System.out.println(Arrays.toString(newArr));
    }
}