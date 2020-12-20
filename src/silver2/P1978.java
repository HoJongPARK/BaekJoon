package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1978 {
	static int[] arr=new int[1001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		String[] temp=br.readLine().split(" ");
		makePrimeArr();
		int count=0;
		while(N-->0) {
			if(arr[Integer.parseInt(temp[N])]==1)
				count++;
		}
		System.out.println(count);
	}
	static void makePrimeArr() {
		
		for(int i=2;i<=1000;i++) {
			boolean isPrime=true;
			if(arr[i]==-1)
				continue;
			for(int j=2;j*j<=i;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime==true)
			{
				arr[i]=1;
				for(int k=i+i;k<=1000;k+=i)
					arr[k]=-1;
			}
		}
	}
}
