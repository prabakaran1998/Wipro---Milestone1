package Assignments1;
import java.util.Scanner;
public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n"); 
		int n=s.nextInt();	
        while(n>0)
        {
        	int r=n%10;
        	sum+=r;
        	n=n/10;
		}
        System.out.println(sum);

		}
	}


