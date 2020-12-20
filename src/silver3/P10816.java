package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10816 {
	static int[] arr=new int[20000002];
	static int num=10000000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		String[] temp=br.readLine().split(" ");
		for(int i=0;i<N;i++)
			arr[Integer.parseInt(temp[i])+num]++;
		int M=Integer.parseInt(br.readLine());
		String[] temp1=br.readLine().split(" ");
		for(int i=0;i<M;i++)
			sb.append(arr[Integer.parseInt(temp1[i])+num]+" ");
		System.out.println(sb);

	}

}
