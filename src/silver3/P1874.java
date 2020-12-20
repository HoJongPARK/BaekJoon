package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1874 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack=new Stack<>();
		int N=Integer.parseInt(br.readLine());
		int index=1;
		
		for(int i=0;i<N;i++) {
			int a=Integer.parseInt(br.readLine());
			if(a>=index)
			{
				for(;index<=a;index++)
				{
					stack.push(index);
					sb.append("+\n");
				}
			}
			if(a<=index)
				if(a==stack.pop())
					sb.append("-\n");
				else
				{
					System.out.println("NO");
					return;
				}
		}
		System.out.println(sb);
	}

}
