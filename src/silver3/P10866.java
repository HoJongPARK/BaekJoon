package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class P10866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Deque<Integer> deque=new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N=Integer.parseInt(br.readLine());
		while(N-->0) {
			String[] temp=br.readLine().split(" ");
			if(temp[0].compareTo("push_front")==0)
				deque.addFirst(Integer.parseInt(temp[1]));
			else if(temp[0].compareTo("push_back")==0)
				deque.addLast(Integer.parseInt(temp[1]));
			else if(temp[0].compareTo("pop_front")==0)
				sb.append((deque.isEmpty()?-1:deque.pollFirst())+"\n");
			else if(temp[0].compareTo("pop_back")==0)
				sb.append((deque.isEmpty()?-1:deque.pollLast())+"\n");
			else if(temp[0].compareTo("size")==0)
				sb.append(deque.size()+"\n");
			else if(temp[0].compareTo("empty")==0)
				sb.append((deque.isEmpty()?1:0)+"\n");
			else if(temp[0].compareTo("front")==0)
				sb.append((deque.isEmpty()?-1:deque.peekFirst())+"\n");
			else
				sb.append((deque.isEmpty()?-1:deque.peekLast())+"\n");
		}
		System.out.print(sb);
	}
}
