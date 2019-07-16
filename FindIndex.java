package Assignments2;

import java.util.Scanner;

public class FindIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean k=false;
		int i;
		int a[]={1,4,34,56,7};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter element to search:");
		int n=s.nextInt();
		 for (i=0;i<=5;i++)  
		    {  
		      if (a[i] == n){
		         k=true;
		         break;
		      }		    	  
		      }if(k){
		    	  System.out.println("The index value:"+i);
		      }
		      else {
		    	  System.out.println("-1");
		      }
		      s.close();

	}

}
