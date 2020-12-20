package silver5;

import java.io.*;
import java.util.*;

public class P6064 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T=Integer.parseInt(br.readLine());
		while(T-->0) {
			String[] input=br.readLine().split(" ");
			int M=Integer.parseInt(input[0]);
			int N=Integer.parseInt(input[1]);
			int x=Integer.parseInt(input[2]);
			int y=Integer.parseInt(input[3]);
			int mulM=M;
			int mulN=N;
			int tempM=M;
			int tempN=N;
			while(mulM!=mulN) {
				if(mulM>mulN)
					mulN+=tempN;
				else
					mulM+=tempM;
			}
			int answer=-1;
			int num=x;
			while(num<=mulM) {
				if(num%N==y||(num%N==0&&N==y)) {
					answer=num;
					System.out.println(answer);
					break;
				}
				num+=M;
			}
			if(answer==-1)
				System.out.println(answer);
			
		}
	}

}
