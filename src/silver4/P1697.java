package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1697 {
	static int[] dp;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] temp=br.readLine().split(" ");
		int N=Integer.parseInt(temp[0]);
		int K=Integer.parseInt(temp[1]);
		dp=new int[Math.max(N, K)+10];
		dp[N]=0;
		for(int i=N-1;i>=0;i--)
			dp[i]=dp[i+1]+1;
		solve(N,K);
		System.out.println(dp[K]);
		
	}
	static void solve(int N,int K) {
		
		for(int i=N+1;i<=K+9;i++) {;
			if(i%2==0)
				dp[i]=Math.min(dp[i/2]+1, dp[i-1]+1);
			else
				dp[i]=Math.min(dp[i/2]+2, dp[i-1]+1);
			dp[i-1]=Math.min(dp[i]+1,dp[i-1]);
		}
	}
}
