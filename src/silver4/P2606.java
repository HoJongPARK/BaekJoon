package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class P2606 {
	static int[] visited;
	static int count=0;
	static ArrayList<Integer> arr[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		int M=Integer.parseInt(br.readLine());
		arr=new ArrayList[N+1];
		visited=new int[N+1];
		while(M-->0) {
			 String[] point=br.readLine().split(" ");
			 int x=Integer.parseInt(point[0]);
			 int y=Integer.parseInt(point[1]);
			 if(arr[x]==null)
				 arr[x]=new ArrayList<Integer>();
			 if(arr[y]==null)
				 arr[y]=new ArrayList<Integer>();
			 arr[x].add(y);
			 arr[y].add(x);
		}
		dfs(1);
		System.out.println(count-1);
	}
	static void dfs(int node) {
		count++;
		visited[node]=1;
		for(int i=0;i<arr[node].size();i++)
			if(visited[arr[node].get(i)]!=1)
				dfs(arr[node].get(i));
	}
}
