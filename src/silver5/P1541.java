package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean minusAppear=false;
		String temp=br.readLine();
		int index=0;
		int sum=0;
		for(int i=0;i<temp.length();i++) {
			char a=temp.charAt(i);
			if(a=='+'&&!minusAppear) {
				String num=temp.substring(index,i);
				sum+=Integer.parseInt(num);
				index=i+1;
			}
			else if(a=='-'&&!minusAppear) {
				String num=temp.substring(index,i);
				sum+=Integer.parseInt(num);
				minusAppear=true;
				index=i+1;
			}
			else if(a=='-'||a=='+') {
				String num=temp.substring(index,i);
				sum-=Integer.parseInt(num);
				index=i+1;
			}
			else if(i==temp.length()-1) {
				String num=temp.substring(index,i+1);
				if(minusAppear)
					sum-=Integer.parseInt(num);
				else
					sum+=Integer.parseInt(num);
			}
		}
		System.out.println(sum);
	}
	

}
