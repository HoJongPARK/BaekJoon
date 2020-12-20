package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P11866 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue=new LinkedList<>();
		sb.append("<");
		String[] temp=br.readLine().split(" ");
		int N=Integer.parseInt(temp[0]);
		int K=Integer.parseInt(temp[1]);
		for(int i=1;i<=N;i++)
			queue.add(i);
		while(!queue.isEmpty())
		{
			for(int i=0;i<K-1;i++) {
				int a=queue.poll();
				queue.add(a);
			}
			if(queue.size()!=1)
			sb.append(queue.poll()+", ");
			else
				sb.append(queue.poll());
		}
		sb.append(">");
		System.out.print(sb);

	}

}
