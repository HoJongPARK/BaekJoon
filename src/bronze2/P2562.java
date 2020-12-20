package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int max=-1;int index=0;
		int a=-11;
		for(int i=0;i<9;i++) {
			if(max<(a=Integer.parseInt(br.readLine())))
			{
				max=a;
				index=i+1;
			}
		}
		System.out.printf("%d\n%d",max,index);

	}

}
