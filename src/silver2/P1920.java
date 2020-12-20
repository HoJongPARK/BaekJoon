package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class P1920 {
	static ArrayList<Integer> set;
	public static void main(String[] args) throws NumberFormatException, IOException {
		set=new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		while(N-->0)
			set.add(scan.nextInt());
		Collections.sort(set);
		int M=scan.nextInt();
		while(M-->0) {
			int a=scan.nextInt();
			if(solve(a))
				System.out.println(1);
			else
				System.out.println(0);
		}

	}
	static boolean solve(int N) {
		int start=0;
		int finish=set.size()-1;
		int mid=(start+finish)/2;

		while(set.get(mid)!=N)
		{
			if(start>finish)
				return false;
			if(set.get(mid)>N)
			{
				finish=mid-1;
				mid=(start+finish)/2;
			}
			else
			{
				start=mid+1;
				mid=(start+finish)/2;
			}
		}
		return true;
	}
}
