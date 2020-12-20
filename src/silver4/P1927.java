package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class P1927 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		int N=Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++)
		{
			int a=Integer.parseInt(br.readLine());
			if(a!=0)
				queue.add(a);
			else
				System.out.println(queue.isEmpty()?0:queue.poll());
		}
	}

}
