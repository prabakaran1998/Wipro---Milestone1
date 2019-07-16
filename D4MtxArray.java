package Assignments2;

public class D4MtxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length>3){
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			int num3=Integer.parseInt(args[2]);
			int num4=Integer.parseInt(args[3]);
			int[][] arr=new int[][] {{num1,num2},{num3,num4}};
			int newa[][]=new int[2][2];
			for(int i=1;i>=0;i--){
				for(int j=1;j>=0;j--){
					newa[i][j]=arr[i][j];
					System.out.print(newa[i][j]+" ");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("enter four integer numbers");
		}
		

	}

}
