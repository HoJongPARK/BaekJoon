package silver;
import java.util.*;
import java.io.*;
public class P9465 {
	static int[][] arr;
	static int[][] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int tNum=Integer.parseInt(br.readLine());
		while(tNum-->0) {
			int n=Integer.parseInt(br.readLine());
			arr=new int[2][n];
			dp=new int[3][n];
			for(int i=0;i<2;i++)
			{
				String[] temp=br.readLine().split(" ");
				for(int j=0;j<n;j++)
					arr[i][j]=Integer.parseInt(temp[j]);
			}
			dp[0][0]=arr[0][0];
			dp[1][0]=arr[1][0];
			dp[2][0]=0;
			System.out.println(solve(n));
			
		}
	}
	static int solve(int n) {
		for(int i=1;i<n;i++) {
			dp[0][i]=Math.max(dp[1][i-1]+arr[0][i],dp[2][i-1]+arr[0][i]);
			dp[1][i]=Math.max(dp[0][i-1]+arr[1][i],dp[2][i-1]+arr[1][i]);
			dp[2][i]=Math.max(dp[0][i-1],dp[1][i-1]);
		}
		int max=-1;
		for(int i=0;i<3;i++)
			if(max<dp[i][n-1])
				max=dp[i][n-1];
		return max;
	}
}
