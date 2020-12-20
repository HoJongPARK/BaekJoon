package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1654 {
	static long[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp=br.readLine().split(" ");
		int K=Integer.parseInt(temp[0]);
		int N=Integer.parseInt(temp[1]);
		arr=new long[K];
		long max=-1;
		for(int i=0;i<K;i++) {
			arr[i]=Long.parseLong(br.readLine());
			max=Math.max(arr[i], max);
		}
		System.out.println(solve(N,K,1,max));
	}
	static long solve(long N,long K,long start,long finish) {
		long max=-1;
		long sum=0;
		if(finish<start)
			return -1;
		long midLength=(start+finish)/2;
		for(int i=0;i<K;i++)
			if(midLength!=0)
			sum+=arr[i]/midLength;
		if(sum>=N) {
			max=midLength;
			max=Math.max(max,solve(N,K,midLength+1,finish));
		}
		else
			max=Math.max(max, solve(N,K,start,midLength-1));
		return max;
	}

}
