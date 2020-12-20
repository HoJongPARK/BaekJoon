package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P11724 {
	static ArrayList<Integer> arr[];
	static int[] visited;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp=br.readLine().split(" ");
		int N=Integer.parseInt(temp[0]);
		int M=Integer.parseInt(temp[1]);
		arr=new ArrayList[N+1];
		int count=0;
		visited=new int[N+1];
		while(M-->0) {
			String[] point=br.readLine().split(" ");
			int a=Integer.parseInt(point[0]);int b=Integer.parseInt(point[1]);
			if(arr[a]==null)
				arr[a]=new ArrayList<>();
			if(arr[b]==null)
				arr[b]=new ArrayList<>();
			arr[a].add(b);arr[b].add(a);
		}
		for(int i=1;i<=N;i++)
			if(visited[i]==0) {
				count++;
				dfs(i);
			}
		System.out.println(count);
	}
	static void dfs(int node) {
		visited[node]=1;
		if(arr[node]!=null)
		for(int i=0;i<arr[node].size();i++)
			if(visited[arr[node].get(i)]==0)
				dfs(arr[node].get(i));
	}
}
