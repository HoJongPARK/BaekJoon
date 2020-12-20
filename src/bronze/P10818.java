package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N=Integer.parseInt(br.readLine());
		String[] temp=br.readLine().split(" ");
		int max=-1111111111;int min=999999999;
		for(int i=0;i<N;i++) {
			int a=Integer.parseInt(temp[i]);
			if(a>max)
				max=a;
			if(a<min)
				min=a;
		}
		System.out.printf("%d %d",min,max);
	}

}
