package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1712 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp=br.readLine().split(" ");
		int[] arr=new int[3];
		for(int i=0;i<3;i++)
			arr[i]=Integer.parseInt(temp[i]);
		int plus=arr[2]-arr[1];
		
		if(arr[1]>=arr[2]) {
			System.out.println(-1);
			return;
		}
		System.out.println(arr[0]/plus+1);
	}
}
