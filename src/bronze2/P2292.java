package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long b=0;
		long sum=1;
		int count=1;
		long a=Integer.parseInt(br.readLine());
		if(a==1) {
			System.out.println(1);
			return;
		}
		else {
			while(true) {
				b+=6;
				sum+=b;
				count++;
				if(a<=sum)
					break;
			}
		}
		System.out.println(count);
	}

}
