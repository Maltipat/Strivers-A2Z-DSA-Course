import java.util.*;
public class LargestElementInArray {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("taking the input from user");
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest element in the array is: "+largest);
    }
}