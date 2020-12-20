package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1932 {
	static int[][] arr;
	static int[][] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		arr=new int[N+1][N+1];
		dp=new int[N+1][N+1];
		for(int i=1;i<=N;i++) {
			String[] temp=br.readLine().split(" ");
			for(int j=1;j<=i;j++)
			arr[i][j]=Integer.parseInt(temp[j-1]);
		}
		dp[1][1]=arr[1][1];
		System.out.println(solve(N));
	}
	static int solve(int N) {
		for(int i=2;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				dp[i][j]=Math.max(dp[i-1][j]+arr[i][j],dp[i-1][j-1]+arr[i][j]);
			}
		}
		int max=-1;
		for(int i=1;i<=N;i++)
			if(max<dp[N][i])
				max=dp[N][i];
		return max;
	}
}
