package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1259 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		
		while((str=br.readLine()).compareTo("0")!=0) {
			boolean isPalindrom=true;
			for(int i=0;i<str.length()/2;i++) {
				if(str.charAt(str.length()-(i+1))!=str.charAt(i)) {
					isPalindrom=false;
					break;
				}
			}
			if(isPalindrom)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	
	}

}
