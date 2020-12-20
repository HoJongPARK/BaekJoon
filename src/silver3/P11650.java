package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P11650 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		ArrayList<point> arr=new ArrayList<>();
		while(N-->0)
		{
			String[] temp=br.readLine().split(" ");
			arr.add(new point(Integer.parseInt(temp[0]),Integer.parseInt(temp[1])));
		}
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++)
			sb.append(arr.get(i).x+" "+arr.get(i).y+"\n");
		System.out.print(sb);
			
	}
	static class point implements Comparable<point>{
		int x;
		int y;
		public point(int x,int y) {
			this.x=x;
			this.y=y;
		}
		@Override
		public int compareTo(point o) {
			if(this.x>o.x) return 1;
			else if(this.x<o.x)return -1;
			else {
				if(this.y>o.y)return 1;
				else return -1;
			}
		}
	}
}
