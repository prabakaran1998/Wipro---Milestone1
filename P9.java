package Assignments1;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the character");
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		if(Character.isUpperCase(c)){
		System.out.println(Character.toLowerCase(c));
		}
		else{
			System.out.println(Character.toUpperCase(c));

		}
	}

}
