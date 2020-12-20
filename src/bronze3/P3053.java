package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int r=Integer.parseInt(br.readLine());
		double pi=Math.PI;
		System.out.printf("%.6f\n%.6f",r*r*pi,(double)2*r*r);

	}

}
