package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1012 {
	static int[][] arr;
	static int[] dx= {-1,0,1,0};
	static int[] dy= {0,-1,0,1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tNum=Integer.parseInt(br.readLine());
		
		while(tNum-->0) {
			String[] temp=br.readLine().split(" ");
			int M=Integer.parseInt(temp[0]);
			int N=Integer.parseInt(temp[1]);
			int K=Integer.parseInt(temp[2]);
			arr=new int[N][M];
			for(int i=0;i<K;i++) {
				String[] point=br.readLine().split(" ");
				arr[Integer.parseInt(point[1])][Integer.parseInt(point[0])]=1;
			}
			System.out.println(solve(N,M));
			
		}
	}
	static int solve(int N,int M) {
		int count=0;
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++) {
				if(arr[i][j]==1) {
					count++;
					dfs(j,i,N,M);
				}
			}
		return count;
	}
	static void dfs(int x,int y,int N,int M) {
		
		arr[y][x]=-1;
		for(int i=0;i<4;i++)
		{
			int tempY=y+dy[i];
			int tempX=x+dx[i];
			if(isIn(tempX,tempY,N,M)&&arr[tempY][tempX]==1) {
				arr[tempY][tempX]=-1;
				dfs(tempX,tempY,N,M);
			}
		}
	}
	static boolean isIn(int x,int y,int N,int M) {
		if(x<0||x>=M||y<0||y>=N)
			return false;
		return true;
	}
}
