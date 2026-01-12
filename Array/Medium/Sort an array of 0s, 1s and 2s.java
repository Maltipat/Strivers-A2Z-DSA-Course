import java.lang.reflect.Array;
import java.util.Arrays;

public class Sortanarray0s1sAnd2s {
    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,2}; 
        int result[] = sortarray(arr);
        System.out.println(Arrays.toString(result));
        
    }
    public static int[] sortarray(int nums[]){
        int mid=0,high=nums.length-1,low=0;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
        return nums;
    }
}
