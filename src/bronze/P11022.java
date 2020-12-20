package bronze;
import java.io.*;
public class P11022 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int tNum=Integer.parseInt(br.readLine());
		int count=1;
		while(tNum-->0) {
			
			String[] temp=br.readLine().split(" ");
			sb.append("Case #");
			sb.append(count++);
			sb.append(": ");
			sb.append(Integer.parseInt(temp[0])+" + "+Integer.parseInt(temp[1])+" = ");
			sb.append(Integer.parseInt(temp[0])+Integer.parseInt(temp[1]));
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
