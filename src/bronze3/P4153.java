package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P4153 {

	public static void main(String[] args) throws IOException {
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String[] temp=br.readLine().split(" ");
			queue.add(Integer.parseInt(temp[0]));
			queue.add(Integer.parseInt(temp[1]));
			queue.add(Integer.parseInt(temp[2]));
			if(queue.contains(0))
				break;
			if((int)Math.pow(queue.poll(), 2)+(int)Math.pow(queue.poll(), 2)==(int)Math.pow(queue.poll(), 2))
				System.out.println("right");
			else
				System.out.println("wrong");
		}

	}

}
