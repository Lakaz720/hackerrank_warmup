package hr_DiagonalDifference;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        System.out.println(DiaDif(a,n));
	}
	
	public static int DiaDif(int a[][],int n){
		
		int ad=0;
		int bd=0;
		int re;
		
		for(int i=0;i<n;i++){
			ad+=a[i][i];
		}
		for(int i=0;i<n;i++){
			bd+=a[(n-1)-i][i];
		}
		re=ad-bd;
		if(re<0)re=-(re);
		return re;
	}

}
