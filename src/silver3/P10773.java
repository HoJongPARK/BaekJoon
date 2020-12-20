package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Stack<Integer> stack=new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K=Integer.parseInt(br.readLine());
		int sum=0;
		while(K-->0)
		{
			int temp=Integer.parseInt(br.readLine());
			if(temp==0) {
				sum-=stack.pop();
			}
			else {
				sum+=temp;
				stack.push(temp);
			}
		}
		System.out.println(sum);
	}

}
