package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class P2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N=Integer.parseInt(br.readLine());
		ArrayList<Integer> arr=new ArrayList<>();
		while(N-->0)
			arr.add(Integer.parseInt(br.readLine()));
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++)
			sb.append(arr.get(i)+"\n");
		System.out.print(sb);

	}

}
