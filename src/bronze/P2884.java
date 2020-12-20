package bronze;
import java.io.*;
public class P2884 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		String[] temp=br.readLine().split(" ");
		int h=Integer.parseInt(temp[0]);
		int t=Integer.parseInt(temp[1]);
		
		t-=45;
		if(t<0) {
			h-=1;
			t+=60;
		}
		if(h<0)
			h=23;
		System.out.printf("%d %d", h,t);
	
	}

}
