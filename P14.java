package Assignments1;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of num");
		int num=s.nextInt();
		int count = 0;
		if(num==0 || num==1){
			System.out.println(num+" is niether prime nor composite ");
		}
		else{
				
		for(int i=2;i<=num/2;i++){
		 if(num%i==0){
					System.out.println(num+"is not prime");
					count++;
					break;
				}
		}
		if(count==0){
			
					System.out.println(num+"is prime");
					
					
		}

	}
	}
}
