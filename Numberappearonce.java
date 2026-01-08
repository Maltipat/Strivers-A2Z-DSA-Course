public class Numberappearonce {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4};
        int result=appear(arr);
        System.out.println(result);
    }
    public static int appear(int nums[]){
        for(int i=0;i<nums.length;i++){
               int count=0;
               int a=nums[i];
            for(int j=0;j<nums.length;j++){
                if(nums[j]==a){
                    count++;
                }
            }
            if(count==1){
                return a;
            }
        }
        return -1;
        
    }
}
