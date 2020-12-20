package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P1697byGraph {
	static int[] visited;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp=br.readLine().split(" ");
		int N=Integer.parseInt(temp[0]);
		int K=Integer.parseInt(temp[1]);
		int size=Math.max(N, K)*2+1;
		visited=new int[size];
		System.out.println(bfs(N,K,size));
	}
	static int bfs(int N,int K,int Msize) {
		int count=0;
		Queue<Integer> queue=new LinkedList<>();
		visited[N]=1;
		queue.add(N);
		while(!queue.isEmpty()) {
			int size=queue.size();
			for(int i=0;i<size;i++) {
				int a=queue.poll();
				if(a==K)
					return count;
				if(a-1>=0&&visited[a-1]==0) {
					visited[a-1]=1;
					queue.add(a-1);
				}
				if(a+1<Msize&&visited[a+1]==0)
				{
					visited[a+1]=1;
					queue.add(a+1);
				}
				if(a*2<Msize&&visited[a*2]==0) {
					visited[a*2]=1;
					queue.add(a*2);
				}
			}
			count++;
		}
		return count;	
	}

}
