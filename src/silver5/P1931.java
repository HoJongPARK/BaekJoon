package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class P1931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		ArrayList<meeting> arr=new ArrayList<>();
		for(int i=0;i<N;i++)
		{
			String[] temp=br.readLine().split(" ");
			arr.add(new meeting(
					Integer.parseInt(temp[0]),Integer.parseInt(temp[1])));
		}
		Collections.sort(arr);
		int count=0;int end=0;
		for(int i=0;i<N;i++)
		{
			meeting meet=arr.get(i);
			if(meet.start>=end) {
				count++;
				end=meet.finish;
			}
		}
		System.out.println(count);
	}
	static class meeting implements Comparable<meeting>{
		int start;
		int finish;
		meeting(int start,int finish){
			this.start=start;
			this.finish=finish;
		}
		@Override
		public int compareTo(meeting o) {
			if(this.finish>o.finish) return 1;
			else if(this.finish==o.finish) { 
				if(this.start>o.start)return 1;
				else if(this.start==o.start)return 1;
				else return -1;
			}
			else return -1;
		}
	}
}
