package Assignments1;

import java.util.Scanner;

public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n"); 
		int n=s.nextInt();
		int sum=0;
		int temp=n;
		while(n>0){
			int a=n%10;
			n=n/10;
		    sum=(sum*10)+a;
		}
		if(temp==sum){
			System.out.println("The given Number Is Palindrome");
		}
			else{
				System.out.println("The Given Number Is Not Palindrome");
			}
		}
	}
