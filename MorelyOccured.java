package Assignments2;

import java.util.Arrays;
import java.util.Scanner;

public class MorelyOccured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n=d.nextInt();
		int a[] = new int[n];	
		int bigcount = 1, res = a[0] , currentcount = 1;
		System.out.println("Enter elements foe array:");
		for (int i = 0; i < n; i++) {
			a[i]=d.nextInt();
		}
		Arrays.sort(a);
		for (int i = 1; i < n; i++) 
        { 
            if (a[i] == a[i - 1]) 
                currentcount++; 
            else 
            { 
                if (currentcount > bigcount) 
                { 
                    bigcount = currentcount; 
                    res = a[i - 1]; 
                } 
                currentcount = 1; 
            } 
        } 
        // If last element is most frequent 
        if (currentcount > bigcount) 
        { 
            bigcount = currentcount; 
            res = a[n - 1]; 
        } 
        System.out.println("The element has occurred the highest number of times is "+res);

	}

}
