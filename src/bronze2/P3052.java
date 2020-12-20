package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] num=new int[1001];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<10;i++) {
			num[Integer.parseInt(br.readLine())%42]=1;
		}
		int count=0;
		for(int i=0;i<num.length;i++)
			if(num[i]==1)
				count++;
		System.out.println(count);
	}

}
