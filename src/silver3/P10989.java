package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		int[] arr=new int[10001];
		int max=-1;
		for(int i=0;i<N;i++) {
			int index=Integer.parseInt(br.readLine());
			arr[index]++;
			max=Math.max(max,index);	
		}
		
		
		for(int i=1;i<=max;i++)
			for(int j=0;j<arr[i];j++)
				sb.append(i+"\n");
		System.out.print(sb);
	}

}
