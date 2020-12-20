package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2579 {
	static int[] arr;
	static int[][] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		arr=new int[N+3];
		dp=new int[N+3][2];
		for(int i=1;i<=N;i++)
			arr[i]=Integer.parseInt(br.readLine());
		dp[1][0]=arr[1];
		dp[2][0]=arr[2]+arr[1];
		dp[2][1]=arr[2];
		System.out.println(solve(N));
	}
	
	static int solve(int N) {
		for(int i=3;i<=N;i++) {
			dp[i][0]=dp[i-1][1]+arr[i];
			dp[i][1]=Math.max(dp[i-2][0]+arr[i],dp[i-2][1]+arr[i]);
		}
		return dp[N][0]>dp[N][1]?dp[N][0]:dp[N][1];
	}
}
