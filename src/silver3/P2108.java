package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.*;

public class P2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] arr=new int[8002];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list=new ArrayList<>();
		int N=Integer.parseInt(br.readLine());
		int sum=0;
		for(int i=0;i<N;i++) {
			int temp=Integer.parseInt(br.readLine());
			sum+=temp;
			arr[temp+4000]++;
			list.add(temp);
		}
		Collections.sort(list);
		int maxcount=-1;
		for(int i=0;i<8001;i++)
			if(arr[i]>maxcount)
				maxcount=arr[i];
		ArrayList<Integer> temp=new ArrayList<>();
		for(int i=0;i<8001;i++)
			if(arr[i]==maxcount)
				temp.add(i-4000);
			
		System.out.printf("%d\n",Math.round((double)sum/N));
		System.out.printf("%d\n",list.get(list.size()/2));
		if(temp.size()>=2)
			System.out.println(temp.get(1));
		else
			System.out.println(temp.get(0));
		System.out.println(list.get(list.size()-1)-list.get(0));
		
	}

}
