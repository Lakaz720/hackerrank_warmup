package hr_PlusMinus;

import java.util.Scanner;

public class hr_PlusMinus {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        float re[]=check(arr);
        
        for(int i=0;i<3;i++){
        	System.out.println(re[i]/n);
        }
        
    }
	
	public static float[] check(int a[]){
		float re[]=new float [3];
		for(int i=0;i<a.length;i++){
			if(a[i]>0){
				re[0]++;
			}else if(a[i]<0){
				re[1]++;
			}else re[2]++;
		}
		
		return re;
	}
}
