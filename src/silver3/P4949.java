package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P4949 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String temp;
		
		while((temp=br.readLine()).compareTo(".")!=0) {
			boolean isBalanced = solve(temp,temp.length());
			sb.append((isBalanced?"yes":"no")+"\n");
		}
		System.out.print(sb);
		
	}
	static boolean solve(String temp,int length) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<length;i++) {
			char tempChar=temp.charAt(i);
			if(tempChar=='('||tempChar=='[')
				stack.push(tempChar);
			else if(tempChar==')'||tempChar==']')
			{
				if(stack.isEmpty()) return false;
				char popChar=stack.pop();
				if(tempChar==')') {
					if(popChar!='(')
						return false;
				}
				else
					if(popChar!='[')
						return false;
			}
		}
		
		
		if(stack.isEmpty())
			return true;
		else
			return false;
	}
}
