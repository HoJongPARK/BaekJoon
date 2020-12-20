package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1011 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tNum=Integer.parseInt(br.readLine());
		while(tNum-->0) {
			int tempnum=1;
			int count=3;
			String[] temp=br.readLine().split(" ");
			long x=Long.parseLong(temp[0]);
			long y=Long.parseLong(temp[1]);
			long distance=y-x;
			long start=3;
			long finish=4;
			long range=2;
			if(distance==1) 
				System.out.println(1);
			else if(distance==2)
				System.out.println(2);
			else {
			while(true) {
				if(distance>=start&&distance<=finish)
					break;
				count++;
				start=finish+1;
				finish=start+range-1;
				tempnum++;
				if(tempnum==2) {
					range++;
					tempnum=0;
				}
			}
			System.out.println(count);
			}
		}

	}

}
