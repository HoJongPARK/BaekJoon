package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9461 {
	static long[] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tNum=Integer.parseInt(br.readLine());
		
		while(tNum-->0) {
			int N=Integer.parseInt(br.readLine());
			dp=new long[N+11];dp[1]=1;dp[2]=1;dp[3]=1;
			dp[4]=2;dp[5]=2;dp[6]=3;dp[7]=4;dp[8]=5;
			dp[9]=7;dp[10]=9;
			System.out.println(solve(N));
		}
	}
	static long solve(int N) {
		for(int i=11;i<=N;i++) {
			dp[i]=dp[i-3]+dp[i-2];
		}
		return dp[N];
	}
}
