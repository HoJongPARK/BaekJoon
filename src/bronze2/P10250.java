package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tNum=Integer.parseInt(br.readLine());
		while(tNum-->0) {
			String[] temp=br.readLine().split(" ");
			int H=Integer.parseInt(temp[0]);
			int W=Integer.parseInt(temp[1]);
			int N=Integer.parseInt(temp[2]);
			System.out.printf("%d%02d\n",N%H!=0?N%H:H,(int)Math.ceil((double)N/H));
		}

	}

}
