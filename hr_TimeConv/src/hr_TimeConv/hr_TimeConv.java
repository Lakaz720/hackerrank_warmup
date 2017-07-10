package hr_TimeConv;

import java.util.Scanner;

public class hr_TimeConv {
	static String timeConversion(String s) {
        // Complete this function
		    String r[]=s.split(":");
	        String re="";
	        if(r[r.length-1].charAt(2)=='P'
	        		&&(!r[0].equals("12"))){
	            int temp=Integer.valueOf(r[0])+12;
	            r[0]=String.valueOf(temp);
	        }
	        if(r[r.length-1].charAt(2)=='A'
	        		&&r[0].equals("12")){
	            r[0]="00";
	        }
	        String temp="";
	        temp=temp
	        		+r[r.length-1].charAt(0)
	        		+r[r.length-1].charAt(1);
	        r[r.length-1]=temp;
	        for(int i=0;i<r.length;i++){
	            re+=r[i];
	            if(i!=r.length-1)re+=":";
	        }
	        
	        return re;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
