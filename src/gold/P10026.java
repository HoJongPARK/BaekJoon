package gold;

import java.io.*;
import java.util.*;

public class P10026 {
	static char[][] arr;
	static char[][] disabled;
	static int[] dx= {-1,0,1,0};
	static int[] dy= {0,-1,0,1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N=Integer.parseInt(br.readLine());
		arr=new char[N][N];
		disabled=new char[N][N];
		for(int i=0;i<N;i++) {
			String input=br.readLine();
			for(int j=0;j<N;j++)
			{
				arr[i][j]=input.charAt(j);
				disabled[i][j]=input.charAt(j);
			}
		}
		System.out.print(solve(N,arr,0)+" ");
		System.out.println(solve(N,disabled,1));
	}
	static int solve(int N,char[][] arr,int mode) {
		int count=0;
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++) {
				char temp=arr[i][j];
				if(temp=='R'||temp=='B'||temp=='G') {
					count++;
					dfs(arr,new point(j,i),temp,N,mode);
				}
			}
		return count;
	}
	static void dfs(char[][] arr,point node,char color,int N,int mode) {
		arr[node.y][node.x]='C';
		for(int i=0;i<4;i++) {
			int X=node.x+dx[i];
			int Y=node.y+dy[i];
			if(mode==0) {
			if(isIn(X,Y,N)&&arr[Y][X]==color)
				dfs(arr,new point(X,Y),color,N,mode);
			}
			else {
				if(isIn(X,Y,N)) {
					if((color=='R'||color=='G')&&(disabled[Y][X]=='R'||disabled[Y][X]=='G'))
						dfs(arr,new point(X,Y),color,N,mode);
					else if(color=='B'&&disabled[Y][X]=='B')
						dfs(arr,new point(X,Y),color,N,mode);
				}
			}
		}
	}
	
	static boolean isIn(int x,int y,int N) {
		if(x<0||y<0||x>=N||y>=N)
			return false;
		return true;
	}
	static class point{
		int x;
		int y;
		point(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
}
