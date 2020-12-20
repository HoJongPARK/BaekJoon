package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9251 {
	
	static int[][] dp;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String a=br.readLine();
		String b=br.readLine();
		dp=new int[a.length()+1][b.length()+1];
		
		System.out.println(solve(a,b));
		
	}
	static int solve(String a,String b) {
		int max=-1;
		for(int i=1;i<a.length()+1;i++)
			for(int j=1;j<b.length()+1;j++) {
				if(a.charAt(i-1)==b.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else {
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				}
				if(max<dp[i][j])
					max=dp[i][j];
			}
		return max;
	}
}
