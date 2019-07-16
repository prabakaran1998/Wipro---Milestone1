package Assignments1;
import java.util.Scanner;
public class P21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n"); 
		int n=s.nextInt();	
for(int i=1;i<=n;i++){
	if(i%2==0 && i%3==0 && i%5==0){
		System.out.println(i+"\n");
	}
	}    
}
	}