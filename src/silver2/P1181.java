package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class P1181{

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<String> temp=new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			if(!temp.contains(str))
			temp.add(str);
		}
		Collections.sort(temp,new Comparator<String>()
				{

					@Override
					public int compare(String o1, String o2) {
						if(o1.length()>o2.length())
							return 1;
						else if(o1.length()==o2.length()) 
							return o1.compareTo(o2);
						else
							return -1;
					}
			
				});
		for(int i=0;i<temp.size();i++) {
			sb.append(temp.get(i));
			sb.append("\n");
		}
		System.out.println(sb);
	}


}
