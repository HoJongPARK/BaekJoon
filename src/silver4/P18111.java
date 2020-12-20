package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P18111 {
	static int[][] arr;
	static int maxHeight=-1;
	static int minHeight=257;
	static int ansHeight;
	static int ansTime=Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp=br.readLine().split(" ");
		int N=Integer.parseInt(temp[0]);
		int M=Integer.parseInt(temp[1]);
		int B=Integer.parseInt(temp[2]);
		arr=new int[N][M];
		
		for(int i=0;i<N;i++)
		{
			String[] temp1=br.readLine().split(" ");
			for(int j=0;j<M;j++) {
				arr[i][j]=Integer.parseInt(temp1[j]);
				maxHeight=Math.max(arr[i][j], maxHeight);
				minHeight=Math.min(arr[i][j], minHeight);
			}
		}
		for(int i=minHeight;i<=maxHeight;i++) {
			solve(i,N,M,B);
		}
		System.out.printf("%d %d\n", ansTime,ansHeight);
	}
	static void solve(int height,int N,int M,int B) {
		int time=0;
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++) {
				int sub=arr[i][j]-height;
				if(sub>0) // 현재 좌표가 맞추려는 높이보다 높을 경우
				{
					B+=sub;
					time+=2*sub;
				}
				else
				{
					B+=sub;
					time+=-1*sub;
				}
			}
		if(B>=0)
		{
			if(ansTime>=time) {
				ansTime=time;
				ansHeight=height;
			}
		}
	}
}
