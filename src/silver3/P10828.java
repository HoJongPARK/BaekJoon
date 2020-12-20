package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack stack=new Stack();
		int N=Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			String[] temp=br.readLine().split(" ");
			if(temp[0].compareTo("push")==0)
				stack.push(Integer.parseInt(temp[1]));
			else if(temp[0].compareTo("pop")==0)
				sb.append((stack.isEmpty()?-1:stack.pop())+"\n");
			else if(temp[0].compareTo("size")==0)
				sb.append(stack.size()+"\n");
			else if(temp[0].compareTo("empty")==0)
				sb.append((stack.isEmpty()?1:0)+"\n");
			else
				sb.append((stack.isEmpty()?-1:stack.peek())+"\n");
		
		}
		System.out.print(sb);	
	}
}
