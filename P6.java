package Assignments1;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n"); 
		String n=s.nextLine();
		if(n.length()==0){
			System.out.println("No values");
		}else{
			System.out.println(n.replaceAll(" ", ","));
		}

	}

}
