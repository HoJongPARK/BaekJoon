package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1074 {
	static int count = 0;
	static boolean found = false;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] temp = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int r = Integer.parseInt(temp[1]);
		int c = Integer.parseInt(temp[2]);
		solve(N, r, c, 0, 0);
		System.out.println(count);
	}

	static void solve(int N, int r, int c, int startX, int startY) {
		int length = (int) Math.pow(2, N - 1);
		if (found)
			return;
		if (N == 1) {
			count += (r - startY) * 2;
			count += c - startX;
			found = true;
			return;
		}
		if (r >= startY&&r<startY+length && c >= startX&&c<startX+length)
			solve(N - 1, r, c, startX, startY);
		else if(!found)
			count += length * length;
		if (r >= startY&&r<startY+length  && c >= startX+length)
			solve(N - 1, r, c, startX+length, startY);
		else if(!found)
			count += length * length;
		if (r >= startY + length && c >= startX&&c<startX+length)
			solve(N - 1, r, c, startX, startY+length);
		else if(!found)
			count += length * length;
		if (r >= startY + length && c >= startX + length)
			solve(N - 1, r, c, startX + length, startY + length);
		else if(!found)
			count += length * length;

	}
}
