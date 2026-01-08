public class Numberappearonce {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4};
        int result=appear(arr);
        System.out.println(result);
    }
  public static int appear(int nums[]){
    int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}
