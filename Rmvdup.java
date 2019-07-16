package Assignments2;
import java.util.Arrays;
import java.util.Scanner;

public class Rmvdup {
public static void main(String[] args){
	int a[]=new int[] {12,34,12,45,67,89};
	int len=a.length;
	for(int i=0;i<len;i++){
		for(int j=i+1;j<len;j++){
			if(a[i]==a[j]){
				int shift=j;
				for(int k=j+1;k<len;k++){
					a[shift]=a[k];
				}
				len--;
				j--;
			}
		}
	}
	int aDup[]=new int[len];
	for(int i=0;i<len;i++){
		aDup[i]=a[i];
	}
	System.out.println(Arrays.toString(aDup));
}
}
