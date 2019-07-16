package Assignments1;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		char n=s.next().charAt(0);
		 if ((n>=65 && n<=90) || (n>=97 && n<=122)){
		            System.out.println(" Alphabet ");
		 }
		 else if (n>=48 && n<=57) {
	            System.out.println(" Digit "); 
		 }
	        else{
	            System.out.println(" Special Character "); 
	   
	        } 
		 }

	}


