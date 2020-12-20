package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11403 {
	static int[][] arr;
	static int[] visited;
	static boolean find=false;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		arr=new int[N][N];
		for(int i=0;i<N;i++) {
			String[] point=br.readLine().split(" ");
			for(int j=0;j<N;j++)
				arr[i][j]=Integer.parseInt(point[j]);
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				visited=new int[N];
				find=false;
				dfs(i,j,N);
				if(find) 
					sb.append("1 ");
				else
					sb.append("0 ");
			}
		sb.append("\n");
		}
		System.out.print(sb);
	}
	static void dfs(int node,int target,int N) {
		if(find) return;
		visited[node]=1;
		for(int i=0;i<N;i++) {
			if(arr[node][i]==1) {
				if(i==target) {
					find=true;
					return;
				}
				if(visited[i]==0)
				dfs(i,target,N);
			}
		}
	}
}
