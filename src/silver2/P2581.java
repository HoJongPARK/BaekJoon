package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2581 {

	static int[] arr=new int[10001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int M=Integer.parseInt(br.readLine());
		int N=Integer.parseInt(br.readLine());
		makePrimeArr(N);
		int sum=0;
		int min=0;
		while(M<=N) {
			if(arr[M]==1) {
				sum+=M;
				if(min==0)
					min=M;
			}
			M++;
		}
		if(sum!=0)
			System.out.printf("%d\n%d",sum,min);
		else
			System.out.println(-1);
		
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
