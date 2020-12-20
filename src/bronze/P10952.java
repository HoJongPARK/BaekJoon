package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10952 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a=-1,b=-1;
	
		while(true) {
			String temp=br.readLine();
			if(temp==null||temp=="")
				break;
			String[] tempArr=temp.split(" ");
			
			a=Integer.parseInt(tempArr[0]);
			b=Integer.parseInt(tempArr[1]);
			System.out.println(a+b);
			
		}
	}

}
