package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2805 {
	static int[] arr;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);
		arr = new int[N];
		int max = -1;

		String[] temp1 = br.readLine().split(" ");

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(temp1[i]);
			max = Math.max(arr[i], max);
		}
		System.out.println(solve(N, M, 0, (long) max));

	}

	static long solve(int N, int M, long start, long high) {
		if (start > high)
			return -1;
		long max = -1;
		long mid = (start + high) / 2;
		long sum = 0;
		for (int i = 0; i < N; i++)
			if (arr[i] > mid)
				sum += arr[i] - mid;
		if (sum >= M) {
			max = mid;
			max = Math.max(max, solve(N, M, mid + 1, high));
		} else
			max = Math.max(max, solve(N, M, start, mid - 1));

		return  max;
	}
}
