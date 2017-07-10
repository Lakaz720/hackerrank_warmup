package hr_SolveMeFirst;

import java.util.Scanner;

public class hr_SolveMeFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
	}

	private static int solveMeFirst(int a, int b) {
		// TODO Auto-generated method stub
		int re=a+b;
		
		return re;
	}

}
