package Assignments1;
import java.util.*;
public class P22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			char number='n';
			do {
			System.out.println("1.Add");
			System.out.println("2.Sub");
			int i=scan.nextInt();
			switch (i) {
			case 1:
			System.out.println("Enter two number to sum: ");
			int a=scan.nextInt();
			int b=scan.nextInt();
			System.out.println("sum: "+(a+b));
			break;
			case 2:
			System.out.println("Enter two number to reduce: ");
			int c=scan.nextInt();
			int d=scan.nextInt();
			System.out.println("Reduce: "+(c-d));
			break;

			default:
			System.out.println("Enter the given number");
			break;
			}
			System.out.println("Do u want to continue press Y or y");
			number=scan.next().charAt(0);
			} while (number=='y'||number=='Y');
			scan.close();
			}
		}


	
	

