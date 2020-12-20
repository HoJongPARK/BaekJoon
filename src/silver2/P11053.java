package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11053 {
	static int[] arr;
	static int[][] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		arr=new int[N];
		String[] temp=br.readLine().split(" ");
		for(int i=0;i<N;i++)
			arr[i]=Integer.parseInt(temp[i]);
		dp=new int[N][2];
		dp[0][0]=1;dp[0][1]=arr[0];
		if(N==1)
			System.out.println(1);
		else
		System.out.println(solve(N));
	}
	static int solve(int N) {
		int max=-1;
		for(int i=1;i<N;i++) {
			for(int j=0;j<i;j++)
			{
				if(arr[i]>dp[j][1])
				{
					if(dp[i][0]<dp[j][0]+1)
					{
						dp[i][0]=dp[j][0]+1;
						dp[i][1]=arr[i];
					}
				}
			}			if(dp[i][0]==0) {dp[i][0]=1;dp[i][1]=arr[i];}
			if(max<dp[i][0])
				max=dp[i][0];
		}
		return max;
	}
}
