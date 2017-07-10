package hr_GradingStudents;

import java.util.Scanner;

public class hr_GradingStudents {

	 public static int[] solve(int[] grades){
	        // Complete this function
			
			//int result[]=new int [grades.length];
			
			for(int i=0;i<grades.length;i++){
				int j=grades[i]%10;
				//System.out.println(grades[i]);
				if(grades[i]>37){
					if(j!=0&&j!=5){
						if(j>5&&10-j<3){
							grades[i]=(grades[i]/10)*10+10;
						}else if(j<5&&5-j<3){
							grades[i]=(grades[i]/10)*10+5;
						}
					}
				}
				
			}
			
			return grades;
	    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }

}
