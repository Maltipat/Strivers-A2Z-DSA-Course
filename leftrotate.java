import java.sql.Array;
import java.util.Arrays;

public class leftrotate {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6};
        int result[] = rotate(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] rotate(int arr[]){
        int temp=arr[0];
        int n=arr.length;
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }
    
}
