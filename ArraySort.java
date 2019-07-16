package Assignments2;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n, temp;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the no of elements in array:\n");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter the elements:");
	        for (int i=0;i<n;i++) 
	        {
	            a[i]=s.nextInt();
	        }
	        for (int i=0;i<n;i++) 
	        {
	            for (int j=i+1;j<n;j++) 
	            {
	                if (a[i]>a[j]) 
	                {
	                    temp=a[i];
	                    a[i]=a[j];
	                    a[j]=temp;
	                }
	            }
	        }
	        System.out.print("sorting of array:");
	        for (int i=0;i<n;i++) 
	        {
	            System.out.print(" "+a[i]);
	        }
	}

}
