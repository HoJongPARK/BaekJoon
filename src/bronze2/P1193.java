package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int X=Integer.parseInt(br.readLine());
		int start=2,finish=3;
		int range=2;
		int from=0;//위부터 시작
		if(X==1) {
			System.out.println("1/1");
			return;
		}
		while(true) {
			if(X>=start&&X<=finish)
				break;
			start=finish+1;
			finish+=++range;
			if(from==0)
				from=1;
			else
				from=0;
		}
		int a,b;
		if(from==0)
			a=1;
		else
			a=range;
		b=range-a+1;
		for(int i=start;i<X;i++)
		{
			if(from==0) {
				a++;
				b--;
			}
			else {
				a--;
				b++;
			}
		}
		System.out.printf("%d/%d",a,b);
	}

}
