import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 7};

        int result[] = IntersectionArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] IntersectionArray(int nums1[] , int nums2[]){
        ArrayList<Integer> ar= new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                ar.add(nums1[i]);
            }
            i++;
            j++;
        }
        int arr[]=new int[ar.size()];
        for(int k=0;k<ar.size();k++){
            arr[k]=ar.get(k);
        }
        return arr;
    }
    
}
