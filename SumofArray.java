package Assignments2;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the size of array:");
		int n=scan.nextInt();
		int[] a=new int[n];
		int sum=0;
		System.out.println("Enter elements for the array");
		for(int i=0;i<n;i++)
		a[i]=scan.nextInt();
		for(int i=0;i<n;i++)
		{
		 if(a[i]==6)
		 {
		 for(int j=i+1;j<n;j++)
		 if(a[j]==7)
		 for(int k=j;k>=i;k--)
		 a[k]=0;
		 }
		 sum=sum+a[i];
		}
		System.out.println(sum);
		scan.close();


	}

}
