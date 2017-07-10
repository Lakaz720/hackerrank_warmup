package hr_Staircase;

import java.util.Scanner;

public class hr_Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int co = n;
        for(int i =0;i<n;i++){
        	for(int j=0;j<n;j++){
        		if((n-1)-i>j)System.out.print(" ");
        		else System.out.print("#");
        	}
        	System.out.println();
        }
    }
    
}
