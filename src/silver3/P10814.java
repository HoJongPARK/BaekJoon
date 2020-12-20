package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class P10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<User> arr=new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++)
		{
			String[] temp=br.readLine().split(" ");
			arr.add(new User(Integer.parseInt(temp[0]),temp[1],i));
		}
		Collections.sort(arr);
		for(int i=0;i<N;i++) {
			User temp=arr.get(i);
			sb.append(temp.age+" "+temp.name+"\n");
		}
		System.out.println(sb);
			
	}
	static class User implements Comparable<User>{
		int age;
		String name;
		int seq;
		public User(int age,String name,int seq) {
			this.age=age;
			this.name=name;
			this.seq=seq;
		}
		@Override
		public int compareTo(User o) {
			if(this.age>o.age)
				return 1;
			else if(this.age==o.age)
			{
				if(this.seq>o.seq)
					return 1;
				else return -1;
			}
			else
				return -1;
		}
		
	}
}
