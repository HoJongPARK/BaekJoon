package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1085 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp=br.readLine().split(" ");
		int x=Integer.parseInt(temp[0]);
		int y=Integer.parseInt(temp[1]);
		int w=Integer.parseInt(temp[2]);
		int h=Integer.parseInt(temp[3]);
		int minX=Math.min(w-x,x);
		int minY=Math.min(h-y,y);
		System.out.println(Math.min(minX, minY));
			
		}
}
