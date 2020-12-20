package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2609 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp=br.readLine().split(" ");
		
		int a=Integer.parseInt(temp[0]);
		int b=Integer.parseInt(temp[1]);
		if(a>b)
		{
			int tempnum=b;
			b=a;
			a=tempnum;
		}
		int gcd=solve(a,b);
		int multi=mul(a,b);
		sb.append(gcd+"\n");
		sb.append(multi);
		System.out.println(sb);
	}
	static int solve(int a,int b) {
		int gcd=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0&&b%i==0)
				gcd=i;
		}
		return gcd;
	}
	static int mul(int a,int b) {
		int tempa=a;
		int tempb=b;
		while(a!=b) {
			if(a<b)
				a+=tempa;
			else
				b+=tempb;
		}
		return a;
	}
}
