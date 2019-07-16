package Assignments1;

import java.util.Scanner;

public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of num");
		int num=s.nextInt();
		String str=Integer.toString(num);
		char[] c = str.toCharArray(); 
		  
        for (int i = c.length-1; i>=0; i--) 
            System.out.print(c[i]); 
  
		
	}

}
