package Assignments2;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int max=0,min=100;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the no of elements in array:");
	        int n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter the elements:");
	        for (int i=0;i<n;i++) 
	        {
	            a[i]=s.nextInt();
	            if(max<a[i]){
	            	max=a[i];
	            }if(min>a[i]){
	            	min=a[i];
	            }
	        }
	        System.out.println("Maximum value:"+max);
	        System.out.println("Minimum value:"+min);

	}

}
