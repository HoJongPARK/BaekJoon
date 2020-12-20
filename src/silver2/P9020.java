package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9020 {
	static int a = 0, b = 0;
	static int[] arr = new int[10001];

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tNum = Integer.parseInt(br.readLine());
		makePrimeArr(10000);
		while (tNum-- > 0) {
			int N = Integer.parseInt(br.readLine());
			solve(N);
			System.out.printf("%d %d\n", a, b);
		}

	}

	static void solve(int N) {
		int sub = 99999;
		for (int i = 2; i < N; i++)
			if (arr[i] == 1 && arr[N - i] == 1) {
				if ((int) Math.abs(N - i - i) < sub) {
					sub = (int) Math.abs(N - i - i);
					a = i;
					b = N - i;
				}
			}
	}

	static void makePrimeArr(int N) {

		for (int i = 2; i <= N; i++) {
			boolean isPrime = true;
			if (arr[i] == -1)
				continue;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				arr[i] = 1;
				for (int k = i + i; k <= N; k += i)
					arr[k] = -1;
			}
		}
	}
}
