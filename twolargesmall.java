package Assignments2;
import java.util.Arrays;
import java.util.Scanner;

public class twolargesmall {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of the array:");
		int n=s.nextInt();
		int a[] = new int[n];	
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Mini Number: "+"1="+a[0]+" "+"2nd="+a[1]);
		System.out.println("Maxi Number: "+"1="+a[n-1]+" "+"2nd="+a[n-2]);
		s.close();
	}

}
