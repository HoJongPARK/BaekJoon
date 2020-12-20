package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P7576 {
	static int[] dy = { 0, -1, 0, 1 };
	static int[] dx = { -1, 0, 1, 0 };
	static int[][] tomato;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp = br.readLine().split(" ");
		int M = Integer.parseInt(temp[0]);
		int N = Integer.parseInt(temp[1]);
		boolean isFull = true;
		tomato = new int[N][M];
		for (int i = 0; i < N; i++) {
			String[] point = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				tomato[i][j] = Integer.parseInt(point[j]);
				if (tomato[i][j] == 0)
					isFull = false;
			}
		}
		if (isFull) {
			System.out.println(0);
			return;
		}
		int ret = bfs(N, M) - 1;
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				if (tomato[i][j] == 0) {
					System.out.println(-1);
					return;
				}
		System.out.println(ret);
	}

	static int bfs(int N, int M) {
		int day = 0;
		Queue<Point> queue = new LinkedList<>();
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				if (tomato[i][j] == 1)
					queue.add(new Point(i, j));
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				Point temp = queue.poll();
				
				for (int j = 0; j < 4; j++) {
					int X = temp.x + dx[j];
					int Y = temp.y + dy[j];
					if (isIn(X, Y, N, M) && tomato[Y][X] == 0) {
						tomato[Y][X]=1;
						queue.add(new Point(Y, X));
					}
				}
			}
			day++;
		}
		return day;
	}

	static boolean isIn(int x, int y, int N, int M) {
		if (x < 0 || x >= M || y < 0 || y >= N)
			return false;
		return true;
	}

	static class Point {
		int y;
		int x;

		Point(int y, int x) {
			this.x = x;
			this.y = y;
		}
	}
}
