package Assignments1;
import java.util.*;
public class P19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter begining number : ");
		int a = s.nextInt();
		System.out.print("Enter terminating number : ");
		int b = s.nextInt();
		for(int i=a;i<=b;i++){
			for(int j=2;j<i-1;j++){
				if(i%j==0){
				c=1;
				}	
			} if(c==0){
				if(i!=0){
				System.out.println(i);	
				}		
			}else{
				c=0;
			}
		}

	}

}
