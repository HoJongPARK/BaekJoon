package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P1620 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp=br.readLine().split(" ");
		int N=Integer.parseInt(temp[0]);
		int M=Integer.parseInt(temp[1]);
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		HashMap<String,Integer> strMap=new HashMap<>();
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			map.put(i+1,str);
			strMap.put(str,i+1);
		}
		for(int i=0;i<M;i++) {
			String temp1=br.readLine();
			if(temp1.charAt(0)>='A'&&temp1.charAt(0)<='Z')
				System.out.println(strMap.get(temp1));
			else
				System.out.println(map.get(Integer.parseInt(temp1)));
		}
	}

}
