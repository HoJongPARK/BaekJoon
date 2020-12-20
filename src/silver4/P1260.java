package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1260 {
	static int[][] arr;
	static int[] visited;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp=br.readLine().split(" ");
		int N=Integer.parseInt(temp[0]);
		int M=Integer.parseInt(temp[1]);
		int V=Integer.parseInt(temp[2]);
		visited=new int[N+1];
		arr=new int[N+1][N+1];
		for(int i=0;i<M;i++)
		{
			String[] point=br.readLine().split(" ");
			arr[Integer.parseInt(point[0])][Integer.parseInt(point[1])]=1;
			arr[Integer.parseInt(point[1])][Integer.parseInt(point[0])]=1;
		}
		dfs(V,N);
		System.out.println();
		Arrays.fill(visited, 0);
		bfs(V,N);
		
			
	}
	static void dfs(int node,int size) {
		visited[node]=1;
		System.out.printf("%d ",node);
		for(int i=1;i<=size;i++)
		{
			if(arr[node][i]==1&&visited[i]!=1)
				dfs(i,size);
		}
		
	}
	static void bfs(int node,int size) {
		Queue<Integer> queue=new LinkedList<>();
		queue.add(node);
		visited[node]=1;
		while(!queue.isEmpty())
		{
			int a=queue.poll();
			System.out.printf("%d ",a);
			for(int i=1;i<=size;i++)
				if(arr[a][i]==1&&visited[i]!=1) {
					visited[i]=1;
					queue.add(i);
					
				}
		}
	}
}
