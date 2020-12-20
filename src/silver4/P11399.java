package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11399 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		String[] temp=br.readLine().split(" ");
		int[] arr=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=Integer.parseInt(temp[i]);
		Arrays.sort(arr);
		int sum=0;
		int rangeSum=0;
		for(int i=0;i<N;i++)
		{
			sum+=rangeSum+arr[i];
			rangeSum+=arr[i];
		}
		System.out.println(sum);
	}

}
