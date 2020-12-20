package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1929 {

	static int[] arr=new int[1000001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp=br.readLine().split(" ");
		int M=Integer.parseInt(temp[0]);
		int N=Integer.parseInt(temp[1]);
		makePrimeArr(N);
		for(int i=M;i<=N;i++) {
			if(arr[i]==1)
				System.out.println(i);
		}
		
	}
	static void makePrimeArr(int N) {
		
		for(int i=2;i<=N;i++) {
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
				for(int k=i+i;k<=N;k+=i)
					arr[k]=-1;
			}
		}
	}
}
