package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P15829 {

	public static void main(String[] args) throws IOException {
		BigInteger mod=BigInteger.valueOf(1234567891);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		String temp=br.readLine();
		BigInteger sum=BigInteger.ZERO;
		BigInteger num=BigInteger.valueOf(31);
		for(int i=0;i<N;i++)
		{
			BigInteger a=BigInteger.valueOf(temp.charAt(i)-'a'+1);
			BigInteger mul=num.pow(i);
			sum=sum.add(a.multiply(mul));
		}
		sum=sum.mod(mod);
		System.out.println(sum);
		
		
	}

}
