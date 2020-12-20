package silver5;

import java.io.*;
import java.util.*;

public class P7569 {
	static int[][][] arr;
	static int[] dx= {-1,0,1,0,0,0};
	static int[] dy= {0,-1,0,1,0,0};
	static int[] dh= {0,0,0,0,-1,1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String temp[]=br.readLine().split(" ");
		int M=Integer.parseInt(temp[0]);
		int N=Integer.parseInt(temp[1]);
		int H=Integer.parseInt(temp[2]);
		arr=new int[N][M][H];
		for(int i=0;i<H;i++)
			for(int j=0;j<N;j++) {
				String[] tomatotemp=br.readLine().split(" ");
				for(int k=0;k<M;k++) {
					arr[j][k][i]=Integer.parseInt(tomatotemp[k]);
				}
			}
		int ret=bfs(M,N,H);
		if(isComplete(M,N,H)==-1)
			System.out.println(-1);
		else
			System.out.println(ret);
		
		
	}
	static int isComplete(int M,int N,int H) {
		for(int i=0;i<H;i++)
			for(int j=0;j<N;j++)
				for(int k=0;k<M;k++)
					if(arr[j][k][i]==0)
						return -1;
		return 0;
	}
	static int bfs(int M,int N,int H) {
		Queue<point> queue=new LinkedList<>();
		int count=0;
		for(int i=0;i<H;i++)
			for(int j=0;j<N;j++)
				for(int k=0;k<M;k++)
					if(arr[j][k][i]==1) {
						queue.add(new point(k,j,i));
					}
		while(!queue.isEmpty()) {
			int Size=queue.size();
			for(int i=0;i<Size;i++) {
				point temp=queue.poll();
				for(int j=0;j<6;j++) {
					int X=temp.x+dx[j];
					int Y=temp.y+dy[j];
					int Z=temp.h+dh[j];
					if(isIn(X,Y,Z,M,N,H)&&arr[Y][X][Z]==0)
					{
						arr[Y][X][Z]=1;
						queue.add(new point(X,Y,Z));
					}
				}
			}
			count++;
		}
		return count-1;
	}
	static boolean isIn(int x,int y,int h,int M,int N,int H) {
		if(x<0||x>=M||y<0||y>=N||h<0||h>=H)
			return false;
		return true;
	}
	static class point{
		int x;
		int y;
		int h;
		point(int x,int y,int h){
			this.x=x;
			this.y=y;
			this.h=h;
		}
	}
}
