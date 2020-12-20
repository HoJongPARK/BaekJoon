package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P11279 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> arr=new PriorityQueue<>();
		int N=Integer.parseInt(br.readLine());
		while(N-->0) {
			int a=Integer.parseInt(br.readLine());
			if(a==0)
				System.out.println(arr.isEmpty()?0:arr.poll()*-1);
			else
				arr.add(a*-1);
		}
	}

}
