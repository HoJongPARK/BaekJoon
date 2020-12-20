package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2869 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp=br.readLine().split(" ");
		int A=Integer.parseInt(temp[0]);
		int B=Integer.parseInt(temp[1]);
		int V=Integer.parseInt(temp[2]);
		V=V-B;
		int UP=A-B;
		double day=(double)V/UP;
		System.out.println((int)Math.ceil(day));
	}

}
