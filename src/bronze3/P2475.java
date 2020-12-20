package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2475 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp=br.readLine().split(" ");
		int sum=0;
		for(int i=0;i<5;i++)
			sum+=sqr(Integer.parseInt(temp[i]));
		System.out.println(sum%10);
	}
	static int sqr(int n) {
		return n*n;
	}
}
