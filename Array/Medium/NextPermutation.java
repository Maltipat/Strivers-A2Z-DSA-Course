import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[index]){
                swap(nums,i,index);
                break;
            }
        }
        reverse(nums,index+1,n-1);

    }
    public static void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        int[] nums={2,1,5,4,3,0,0};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
