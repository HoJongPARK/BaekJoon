package silver6;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class P1629 {
	static long[] modArr=new long[1000];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		Arrays.fill(modArr, -1);
		String[] input=br.readLine().split(" ");
		long A=Long.parseLong(input[0]);
		long B=Long.parseLong(input[1]);
		long C=Long.parseLong(input[2]);
		System.out.println(solveMod(A,B,C,0));
		
	}
	
	static long solveMod(long A,long B,long C,int count) {
		long mod;
		if(modArr[count]!=-1)
			return modArr[count];
		if(B==1) {
			modArr[count]=A%C;
			return A%C;
		}
		if(B%2==0) {
			mod=(solveMod(A,B/2,C,count+1)*solveMod(A,B/2,C,count+1))%C;
			modArr[count]=mod;
		}
		else {
			mod=((solveMod(A,B/2,C,count+1)*solveMod(A,B/2,C,count+1))%C*(A%C))%C;
			modArr[count]=mod;
		}
		return mod;
		
	}
}
