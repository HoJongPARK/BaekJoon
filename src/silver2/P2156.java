package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2156 {
	static int[][] dp;
	static int[] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		arr=new int[N+10];
		dp=new int[N+10][3];
		for(int i=1;i<=N;i++)
			arr[i]=Integer.parseInt(br.readLine());
		dp[2][0]=arr[1]+arr[2];dp[1][0]=arr[1];
		dp[2][1]=arr[2];dp[2][2]=arr[1];
		if(N==2)
			System.out.println(arr[1]+arr[2]);
		else if(N==1)
			System.out.println(arr[1]);
		else
		System.out.println(solve(N));
	}
	static int solve(int N) {
		int max=arr[1]+arr[2];
		for(int i=3;i<=N;i++)
		{
			dp[i][0]=dp[i-1][1]+arr[i];
			dp[i][1]=Math.max(dp[i-2][0],dp[i-2][1])+arr[i];
			dp[i][1]=Math.max(dp[i][1],dp[i-1][2]+arr[i]);
			dp[i][2]=max;
			if(dp[i][0]>max)
				max=dp[i][0];
			if(dp[i][1]>max)
				max=dp[i][1];
			
		}
		return max;
	}
}
