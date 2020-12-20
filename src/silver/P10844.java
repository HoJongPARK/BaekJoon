package silver;
import java.io.*;
import java.util.*;
public class P10844 {
	static long[][] dp;
	static int max=1000000000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		dp=new long[10][N+1];
		for(int i=0;i<=9;i++)
			dp[i][1]=1;
		System.out.println(solve(N));
	}
	static long solve(int n) {
		
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=8;j++) {
				dp[j][i]=(dp[j-1][i-1]+dp[j+1][i-1])%max;
			}
			dp[0][i]=dp[1][i-1];
			dp[9][i]=dp[8][i-1];
		}
		long sum=0;
		for(int i=1;i<=9;i++)
			sum=(sum+dp[i][n])%max;
		return sum%max;
	}
}
