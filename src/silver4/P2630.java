package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2630 {
	static int[][] arr;
	static int[] color=new int[2];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		arr=new int[N][N];
		for(int i=0;i<N;i++) {
			String[] temp=br.readLine().split(" ");
			for(int j=0;j<N;j++)
				arr[i][j]=Integer.parseInt(temp[j]);
		}
		solve(0,0,N);
		sb.append(color[0]+"\n");
		sb.append(color[1]);
		System.out.print(sb);
		
	}
	static void solve(int startX,int startY,int length) {
		if(length==1)
		{
			color[arr[startY][startX]]++;
			return;
		}
		int temp;
		if((temp=iter(startX,startY,length))==2)
		{
			length=length/2;
			solve(startX,startY,length);
			solve(startX+length,startY,length);
			solve(startX,startY+length,length);
			solve(startX+length,startY+length,length);
		}
		else
			color[temp]++;
		
	}
	static int iter(int startX,int startY,int length) {
		int sum=0;
		for(int i=startY;i<startY+length;i++)
			for(int j=startX;j<startX+length;j++)
				sum+=arr[i][j];
		if(sum==0)
			return 0;
		else if(sum==length*length)
			return 1;
		else return 2;
	}
}
