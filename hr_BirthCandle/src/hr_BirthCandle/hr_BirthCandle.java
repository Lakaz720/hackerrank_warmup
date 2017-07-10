package hr_BirthCandle;

import java.util.Scanner;

public class hr_BirthCandle {
	 static int birthdayCakeCandles(int n, int[] ar) {
	        // Complete this function
		 int max=0;
		 int co=1;
		 for(int i=0;i<ar.length;i++){
			 if(max<ar[i]){
				 co=1; 
				 max=ar[i];
			 }
			 else if(max==ar[i]) co++;
		 }
		 return co;
	 }

	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     int[] ar = new int[n];
	     for(int ar_i = 0; ar_i < n; ar_i++){
	         ar[ar_i] = in.nextInt();
	     }
	     int result = birthdayCakeCandles(n, ar);
	     System.out.println(result);
	    }
}
