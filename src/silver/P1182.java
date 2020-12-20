package silver;
import java.util.*;
public class P1182 {
	static int[] arr=new int[20];
	static int length;
	static int num;
	static int count=0;
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		length=scan.nextInt();
		num=scan.nextInt();
		for(int i=0;i<length;i++)
			arr[i]=scan.nextInt();
		solve(0,0,true);
		solve(0,0,false);
		System.out.println(count);
	}
	static void solve(int start,int sum,boolean insert) {
		if(start>=length)
			return;
		if(insert)
			sum+=arr[start];
		if(insert&&sum==num)
			count++;
		solve(start+1,sum,true);
		solve(start+1,sum,false);
		
		
	}
}
