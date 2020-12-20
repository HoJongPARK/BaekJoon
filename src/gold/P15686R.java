package gold;

import java.io.*;
import java.util.*;

public class P15686R {
	static int[][] map;
	static int[] selected;
	static int minDistance=Integer.MAX_VALUE;
	static ArrayList<point> chicken=new ArrayList<>();
	static ArrayList<point> home=new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] inputSize=br.readLine().split(" ");
		int N=Integer.parseInt(inputSize[0]);
		int M=Integer.parseInt(inputSize[1]);
		map=new int[N][N];
		for(int i=0;i<N;i++) {
			String[] mapInput=br.readLine().split(" ");
			for(int j=0;j<N;j++) {
				map[i][j]=Integer.parseInt(mapInput[j]);
				if(map[i][j]==2) {
					chicken.add(new point(j,i));
					
				}
				else if(map[i][j]==1) {
					home.add(new point(j,i));
				}
			}
		}
		selected=new int[chicken.size()];
		brute(0,0,true,M);
		brute(0,0,false,M);
		System.out.println(minDistance);
	}
	static void brute(int index,int count,boolean choose,int M) {
		if(index>=chicken.size())
			return;
		if(choose)
			selected[count++]=index;
		if(count==M) {
			minDistance=Math.min(findDistance(M),minDistance);
			return;
		}
		
		brute(index+1,count,true,M);
		brute(index+1,count,false,M);
	}
	static int findDistance(int M) {
		int N=home.size();
		int sum=0;
		int[] arr=new int[N];
		Arrays.fill(arr,Integer.MAX_VALUE);
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				arr[i]=Math.min(distance(home.get(i),chicken.get(selected[j])),arr[i]);
			}
		}
		for(int i=0;i<N;i++)
			sum+=arr[i];
		return sum;
	}
	static int distance(point a,point b) {
		return Math.abs(a.x-b.x)+Math.abs(a.y-b.y);
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
