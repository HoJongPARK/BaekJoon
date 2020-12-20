package bronze;
import java.util.*;
import java.io.*;
public class P2798 {
	static int[] arr;
	static int numOfCard;
	static int sumLimit;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		String[] temp=br.readLine().split(" ");
		numOfCard=Integer.parseInt(temp[0]);
		sumLimit=Integer.parseInt(temp[1]);
		arr=new int[numOfCard];
		String[] temp1=br.readLine().split(" ");
		for(int i=0;i<numOfCard;i++)
			arr[i]=Integer.parseInt(temp1[i]);
		int max=-1;
		int num1=solve(0,0,true,0);
		int num2=solve(0,0,false,0);
	
		System.out.println(num1>num2?num1:num2);
		
	}
	static int solve(int pos,int count,boolean insert,int sum) {
		int max=-1;
		if(count==4||pos==numOfCard)
			return 0;
		
		if(insert) {
			sum+=arr[pos];
			count++;
		}
		if(count==3&&sum<=sumLimit) {
			max=max<sum? sum:max;
			return max;
		}
		max=Math.max(max,solve(pos+1,count,true,sum));
		max=Math.max(max,solve(pos+1,count,false,sum));
		return max;
	}
}
