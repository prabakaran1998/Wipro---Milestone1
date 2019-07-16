package Assignments2;

import java.util.Scanner;

public class SumvAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of elements in array:");
		int n=s.nextInt();
		int a[]=new int[n];
        System.out.print("Enter all the elements:\n");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}for(int i=0;i<n;i++){
			sum=sum+a[i];	
		}
		System.out.println("Sum of the array:"+sum);
		float average=sum/n;
		System.out.println("Average of the array:"+average);


	}

}
