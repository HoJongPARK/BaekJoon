package gold;

import java.io.*;
import java.util.*;

public class P15686 {
	static int[][] paper;
	static int[] dx= {-1,0,1,0};
	static int[] dy= {0,-1,0,1};
	static int[] pinkDxy= {-1,1,0};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] size=br.readLine().split(" ");
		int N=Integer.parseInt(size[0]);
		int M=Integer.parseInt(size[1]);
		paper=new int[N][M];
		for(int i=0;i<N;i++) {
			String[] num=br.readLine().split(" ");
			for(int j=0;j<M;j++)
				paper[i][j]=Integer.parseInt(num[j]);
		}
		System.out.println(solve(N,M));
	}
	
	static int solve(int N,int M) {
		int max=-1;
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++) {
				max=Math.max(brute(i,j,N,M,0,0),max);
				max=Math.max(max, pinkBlock(j,i,N,M));
			}
		return max;
	}
	static int brute(int y,int x,int N,int M,int count,int sum) {
		int max=-1;
		sum+=paper[y][x];
		int temp=paper[y][x];
		paper[y][x]=-1;
		count++;
		if(count==4) {
			paper[y][x]=temp;
			return sum;	
		}
		for(int i=0;i<4;i++)
		{
			int Y=y+dy[i];
			int X=x+dx[i];
			if(isIn(X,Y,N,M)&&paper[Y][X]!=-1)
				max=Math.max(max,brute(Y,X,N,M,count,sum));
		}
		paper[y][x]=temp;
		return max;
	}
	static boolean isIn(int x,int y,int N,int M) {
		if(y>=N||x>=M||x<0||y<0)
			return false;
		return true;
	}
	static int pinkBlock(int x,int y,int N,int M) {
		int max=-1;
		int sum=0;
		for(int i=0;i<3;i++) {
			int X=x+pinkDxy[i];
			if(X>=0&&X<M)
				sum+=paper[y][X];
		}
		int Y1=y+1;
		int Y2=y-1;
		if(Y1<N)
		{
			max=sum+paper[Y1][x];
		}
		if(Y2>=0)
			max=Math.max(max,sum+paper[Y2][x]);
		sum=0;
		for(int i=0;i<3;i++) {
			int Y=y+pinkDxy[i];
			if(Y>=0&&Y<N)
				sum+=paper[Y][x];
		}
		int X1=x+1;
		int X2=x-1;
		if(X1<M)
			max=Math.max(max,sum+paper[y][X1]);
		if(X2>=0)
			max=Math.max(sum+paper[y][X2],max);	
		return max;
	}
}
