package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3009 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	int[][] arr=new int[4][2];
	int x1=0,x2=0;
	int y1=0,y2=0;
	int sumX=0,sumY=0;
	for(int i=0;i<3;i++)
	{
		String[] temp=br.readLine().split(" ");
		arr[i][0]=Integer.parseInt(temp[0]);
		arr[i][1]=Integer.parseInt(temp[1]);
		sumX+=arr[i][0];
		sumY+=arr[i][1];
		if(x1==0)
			x1=arr[i][0];
		else if(arr[i][0]!=x1)
			x2=arr[i][0];
		if(y1==0)
			y1=arr[i][1];
		else if(arr[i][1]!=y1)
			y2=arr[i][1];
	}
	System.out.printf("%d %d", (x1+x2)*2-sumX,(y1+y2)*2-sumY);
	
	}
}
