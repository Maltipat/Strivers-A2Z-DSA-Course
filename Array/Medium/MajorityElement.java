import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] votes1 = {1, 1, 2, 1, 2, 1, 1};
        int result=majority(votes1);
        System.out.println(result);
    }
    public static int majority(int nums[]){
        // int n= nums.length;
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int k=i+1;k<nums.length;k++){
        //         if(nums[i]==nums[k]){
        //             count++;
        //         }
        //     }
        //     if(count>n/2){
        //         return nums[i];
        //     }
        // }
        // return -1;
        int count=0;
        int element=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                element=nums[i];
                count++;
            }
            else if(nums[i]==element){
                count++;
            }
            else{
                count--;
            }
        }
        return element;
    } 
}
