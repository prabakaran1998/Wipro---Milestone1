package Assignments2;
import java.util.*;
public class Inttoascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of in the array" );
		int n=s.nextInt();
        String str ="";
		 int num[] = new int[n];
		 System.out.println("Enter the elements to find character");
		for(int i=0;i<n;i++){
			num[i]=s.nextInt();
		}
	        for(int i: num){
	            str = Character.toString((char)i);
	            System.out.println(str);
	        }

	}

}
