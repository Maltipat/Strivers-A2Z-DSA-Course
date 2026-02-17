class Solution {
    public int largestSubarraySumMinimized(int[] a, int k) {
        int low=0;
        int high=0;
        for(int i=0;i<a.length;i++){
            high+=a[i];
            low=Math.max(low,a[i]);
        }
        int result=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(valid(a,k,mid)){
                result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
    public boolean valid(int a[] , int k, int mid){
        int arr=1;
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(sum+a[i]<=mid){
                sum+=a[i];
            }
            else{
                arr++;
                sum=a[i];
            }
            if(arr>k){
                return false;
            }
        }
        return true;
    }
}
