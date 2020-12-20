package gold;

import java.io.*;
import java.util.*;

public class P1107 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] button=new int[10];
		int length=-1;
		int N=Integer.parseInt(br.readLine());
		int M=Integer.parseInt(br.readLine());
		String[] brokenButton;
		if(M>0) {
		brokenButton=br.readLine().split(" ");
		for(int i=0;i<M;i++)
			button[Integer.parseInt(brokenButton[i])]=-1;
		}
		
		long min=Math.abs(N-100);
		min=Math.min(min, solve(button,"",N,0));
		System.out.println(min);
		
	}
	static long solve(int[] button,String channelStr,int N,int length) {
		long min=Integer.MAX_VALUE;
		if(length==7)
			return Integer.MAX_VALUE;
		for(int i=0;i<10;i++) {
			if(button[i]!=-1)
				min=Math.min(min,solve(button,channelStr.concat(String.valueOf(i)),N,length+1));
		}
		if(length!=0)
		{
			int channel=Integer.parseInt(channelStr);
			min=Math.min(min, Math.abs(channel-N)+length);
		}
		return min;
	}

}
