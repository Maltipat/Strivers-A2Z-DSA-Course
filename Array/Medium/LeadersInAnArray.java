import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        List<Integer> li= leaders(arr);
        System.out.println(li);
    }
    public static List<Integer> leaders(int arr[]){
        int max = Integer.MIN_VALUE;
        List<Integer> li = new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] >= max){
                li.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(li); // leaders in left-to-right order
        return li;
    }
    
}
