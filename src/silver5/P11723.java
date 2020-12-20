package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11723 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		int a=0;
		while(N-->0) {
			String[] temp=br.readLine().split(" ");
			if(temp[0].charAt(0)=='a') {
				if(temp[0].charAt(1)=='l') {
					a=a|Integer.MAX_VALUE;
					
				}
				else
				{
					a=a|1<<Integer.parseInt(temp[1]);
				}
			}
			else if(temp[0].charAt(0)=='r') {
				a=a&~(1<<Integer.parseInt(temp[1]));
			}
			else if(temp[0].charAt(0)=='c') {
				if((a&1<<Integer.parseInt(temp[1]))==1<<Integer.parseInt(temp[1]))
					sb.append(1+"\n");
				else
					sb.append(0+"\n");
			}
			else if(temp[0].charAt(0)=='t') {
				a=a^1<<Integer.parseInt(temp[1]);
			}
			else if(temp[0].charAt(0)=='e') {
				a=a&0;
			}
		}
		System.out.print(sb);
	}

}
