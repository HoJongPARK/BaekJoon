package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.*;
public class P1764 {
	public static void main(String[] args) throws IOException {
		HashMap<String,Integer> hashMap=new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] temp=br.readLine().split(" ");
		
		int N=Integer.parseInt(temp[0]);
		int M=Integer.parseInt(temp[1]);
		ArrayList<String> arr=new ArrayList<>();
		for(int i=0;i<N;i++)
			hashMap.put(br.readLine(), 0);
		for(int i=0;i<M;i++)
		{
			String str=br.readLine();
			if(hashMap.containsKey(str))
				arr.add(str);
				
		}
		System.out.println(arr.size());
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++)
			sb.append(arr.get(i)+"\n");
		System.out.print(sb);
			
	}
}
