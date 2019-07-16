package Assignments2;

public class D2MtxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]  a=new int[3][3];
		int a1=0;
		int max=0;
		if(args.length==9) {
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					a[i][j]=Integer.parseInt(args[a1++]);
				}
			}
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(max<a[i][j]){
						max=a[i][j];
					}
				}
			}
			System.out.println(max);
		}
		else{
		System.out.println("Please enter Nine integers");
		}

	}

}
