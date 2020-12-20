package gold;

import java.io.*;
import java.util.*;

public class P16236 {
	static int[][] space;
	static int[] dx= {-1,0,1,0};
	static int[] dy= {0,-1,0,1};
	static int count=0;
	static int size=2;
	static int length=0;
	static point currentPosition;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		space=new int[N][N];
		for(int i=0;i<N;i++)
		{
			String[] input=br.readLine().split(" ");
			for(int j=0;j<N;j++) {
				space[i][j]=Integer.parseInt(input[j]);
				if(space[i][j]==9)
					currentPosition=new point(j,i);
			}
		}
		while(true) {
			point temp=solve(N);
			if(temp==null) break;
			currentPosition=temp;
			count++;
			if(count==size)
			{
				size++;
				count=0;
			}
		}
		System.out.println(length);
	}
	
	static boolean isIn(int x,int y,int N) {
		if(x<0||y<0||x>=N||y>=N)
			return false;
		return true;
	}
	static point solve(int N) {
		Queue<point> queue=new LinkedList<>();
		int[][] check=new int[N][N];
		ArrayList<point> canEat=new ArrayList<point>();
		int move=0;
		boolean isFind=false;
		space[currentPosition.y][currentPosition.x]=0;
		check[currentPosition.y][currentPosition.x]=-1;
		queue.add(currentPosition);
		while(!queue.isEmpty()&&!isFind) {
			int queueSize=queue.size();
			for(int i=0;i<queueSize;i++) {
				point temp=queue.poll();
				for(int j=0;j<4;j++) {
					int X=temp.x+dx[j];
					int Y=temp.y+dy[j];
					if(isIn(X,Y,N)) {
						if(size>=space[Y][X]) {
							if(size>space[Y][X]&&space[Y][X]!=0) {
								isFind=true;
								canEat.add(new point(X,Y));
							}
							else if(check[Y][X]!=-1)
							{
								check[Y][X]=-1;
								queue.add(new point(X,Y));
							}
						}
					}
				}
			}
			move++;
		}
		Collections.sort(canEat,new Comp());
		if(canEat.size()==0)
			return null;
		else {length+=move; return canEat.get(0);}
	}
	static class Comp implements Comparator<point>{

		@Override
		public int compare(point o1, point o2) {
			if(o1.y>o2.y) return 1;
			else if(o1.y==o2.y) {
				if(o1.x>o2.x)return 1;
				else return -1;
			}
			else return -1;
		}
	
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
