package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4948 {

	static int[] arr=new int[246913];
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		makePrimeArr(246912);
		int a=-1;
		while((a=Integer.parseInt(br.readLine()))!=0){
			int count=0;
			for(int i=a+1;i<=2*a;i++) {
				if(arr[i]==1)
					count++;
			}
			System.out.println(count);
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
