package silver;
import java.io.*;
public class P11729 {
	static StringBuilder sb=new StringBuilder();
	static int count=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		hanoi(n,1,3,2);
		System.out.println(count);
		System.out.println(sb);

	}
	static void hanoi(int n,int from,int to,int aux) {
		count++;
		if(n==1) {
			sb.append(from+" "+to+"\n");
			return;
		}
		hanoi(n-1,from,aux,to);
		sb.append(from+" "+to+"\n");
		hanoi(n-1,aux,to,from);
	}
}
