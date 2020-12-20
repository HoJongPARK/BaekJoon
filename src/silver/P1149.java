package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1149 {
	static int[][] arr;
	static int[][] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N=Integer.parseInt(br.readLine());
		arr=new int[N][3];
		dp=new int[N][3];
		for(int i=0;i<N;i++)
		{
			String[] temp=br.readLine().split(" ");
			for(int j=0;j<3;j++)
				arr[i][j]=Integer.parseInt(temp[j]);
		}
		dp[0][0]=arr[0][0];
		dp[0][1]=arr[0][1];
		dp[0][2]=arr[0][2];
		System.out.println(solve(N));

	}
	static int solve(int N) {
		for(int i=1;i<N;i++)
		{
			dp[i][0]=Math.min(dp[i-1][1],dp[i-1][2])+arr[i][0];
			dp[i][1]=Math.min(dp[i-1][0],dp[i-1][2])+arr[i][1];
			dp[i][2]=Math.min(dp[i-1][0], dp[i-1][1])+arr[i][2];
		}
		int min=999999999;
		for(int i=0;i<3;i++)
			if(dp[N-1][i]<min)
				min=dp[N-1][i];
		return min;
	}

}
