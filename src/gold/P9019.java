package gold;

import java.io.*;
import java.util.*;

public class P9019 {
	static int[] visited;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			visited = new int[10000];
			String[] input = br.readLine().split(" ");
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
			
			System.out.println(brute(A, B));
		}
	}

	static String brute(int A, int B) {
		
		Queue<Integer> queue = new LinkedList<>();
		Queue<String> strQueue=new LinkedList<>();
		queue.add(A);
		strQueue.add("");
		visited[A]=-1;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int temp=queue.poll();
				String strTemp=strQueue.poll();
				if(temp==B)
					return strTemp;
				if(visited[D(temp)]!=-1) {
					visited[D(temp)]=-1;
					queue.add(D(temp));
					strQueue.add(strTemp.concat("D"));
				}
				if(visited[S(temp)]!=-1) {
					visited[S(temp)]=-1;
					queue.add(S(temp));
					strQueue.add(strTemp.concat("S"));
				}
				if(visited[L(temp)]!=-1) {
					visited[L(temp)]=-1;
					queue.add(L(temp));
					strQueue.add(strTemp.concat("L"));
				}
				if(visited[R(temp)]!=-1) {
					visited[R(temp)]=-1;
					queue.add(R(temp));
					strQueue.add(strTemp.concat("R"));
				}
			}
		}
		return "";
	}

	static int D(int n) {
		n = n * 2;
		n = n % 10000;
		return n;
	}

	static int S(int n) {
		n = n - 1;
		if (n == -1)
			return 9999;
		return n;
	}

	static int L(int n) {
		int d1 = n / 1000;
		n = n % 1000;
		int d2 = n / 100;
		n = n % 100;
		int d3 = n / 10;
		n = n % 10;
		int d4 = n;
		return d2 * 1000 + d3 * 100 + d4 * 10 + d1;
	}

	static int R(int n) {
		int d1 = n / 1000;
		n = n % 1000;
		int d2 = n / 100;
		n = n % 100;
		int d3 = n / 10;
		n = n % 10;
		int d4 = n;
		return d4 * 1000 + d1 * 100 + d2 * 10 + d3;
	}
}
