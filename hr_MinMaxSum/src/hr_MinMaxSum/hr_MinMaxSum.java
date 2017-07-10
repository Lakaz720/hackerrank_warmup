package hr_MinMaxSum;

import java.util.Arrays;
import java.util.Scanner;

public class hr_MinMaxSum {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        
        long max=0;
        long min=0;
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        Arrays.sort(arr);
        
        for(int i=0;i<4;i++){
            min+=arr[i];
        }
        max=min-arr[0]+arr[arr.length-1];
        
        System.out.println(min + " "+max);
    }
    
}
