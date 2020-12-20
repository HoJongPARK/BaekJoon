package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11050 {
	static int[][] dp;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp=br.readLine().split(" ");
		int N=Integer.parseInt(temp[0]);
		int K=Integer.parseInt(temp[1]);
		dp=new int[N+2][N+2];
		dp[1][1]=1;
		for(int i=1;i<=N;i++)
			for(int j=1;j<=i;j++) {
				dp[i+1][j]=(dp[i][j]*(i+1))/(i-j+1);
				dp[i][j+1]=(dp[i][j]*(i-j))/(j+1);
			}
		if(K!=0)
			System.out.println(dp[N][K]);
		else
			System.out.println(1);
		
	}

}
