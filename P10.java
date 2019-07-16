package Assignments1;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of color");
		String a=s.next();
		String b=a.toUpperCase();
		char color=b.charAt(0);
		
		 switch(color) {
         case 'R' :
            System.out.println("Red"); 
            break;
         case 'B' :
        	 System.out.println("Blue"); 
             break;
         case 'G' :
            System.out.println("Green");
            break;
         case 'O' :
            System.out.println("Orange");
            break;
         case 'Y' :
            System.out.println("yellow");
            break;
         case 'W' :
             System.out.println("White");
             break;
		 
            
         default :
            System.out.println("Invalid color");
      }
    }
	}



